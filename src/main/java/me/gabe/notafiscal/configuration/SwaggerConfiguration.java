package me.gabe.notafiscal.configuration;

import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class SwaggerConfiguration {

    private final Environment env;

    @Bean
    public OpenAPI customOpenAPI() {
        log.info("Swagger: habilitado");

        String serverUrl = "http://localhost:8080";
        if (java.util.Arrays.asList(env.getActiveProfiles()).contains("aws-dev")) {
            serverUrl = "https://api-dev.nuvy.com.br/erp";
        }
        if (java.util.Arrays.asList(env.getActiveProfiles()).contains("aws-hlg")) {
            serverUrl = "https://api-hlg.nuvy.com.br/erp";
        }

        return new OpenAPI()
            .addServersItem(new Server().url(serverUrl))
            .info(new Info()
                .title("Nuvy ERP API")
                .version("1.0")
                .description("Api Nuvy")
            );
    }

    @Bean
    public OpenApiCustomizer customizer() {
        Parameter acceptLanguageHeader = new Parameter()
            .in(ParameterIn.HEADER.toString())
            .schema(new StringSchema()._default("pt-BR"))
            .name("Accept-Language")
            .description("identificador de Locale")
            .addExample("Português", new Example().description("Portugues").value("pt-BR"))
            .addExample("Inglês", new Example().description("Inglês").value("en-US"))
            .addExample("Espanhol", new Example().description("Espanhol").value("es-ES"))
            .required(true);
        return openApi -> openApi.getPaths().values().stream()
        .flatMap(pathItem -> pathItem.readOperations().stream())
        .forEach(operation -> operation.addParametersItem(acceptLanguageHeader));
    }
}
