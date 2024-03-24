package me.gabe.notafiscal.api.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import me.gabe.notafiscal.api.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/nota-fiscal")
class NotaFiscalController {

  private final PedidoService pedidoService;

  @Operation(
      summary = "Importar Nota Fiscal",
      description = "Permite realizar a importação de uma nota fiscal através de um arquivo XML"
  )
  @PostMapping(value = "/importar", consumes = "multipart/form-data")
  @ResponseStatus(HttpStatus.OK)
  private void salvarNotaFiscal(@RequestParam MultipartFile xmlNota) throws IOException {
    pedidoService.parserToNFe(xmlNota);
  }
}