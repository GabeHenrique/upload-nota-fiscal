package me.gabe.notafiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("me.gabe.notafiscal.domain.models")
@SpringBootApplication
public class NotaFiscalApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotaFiscalApplication.class, args);
  }

}
