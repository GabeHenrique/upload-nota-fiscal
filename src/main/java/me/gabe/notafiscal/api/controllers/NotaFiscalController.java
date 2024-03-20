package me.gabe.notafiscal.api.controllers;

import lombok.RequiredArgsConstructor;
import me.gabe.notafiscal.api.services.NotaFiscalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nota-fiscal")
class NotaFiscalController {

  private final NotaFiscalService notaFiscalService;

  @PostMapping(value = "/salvar", consumes = "multipart/form-data")
  private void salvarNotaFiscal(@RequestParam MultipartFile xmlNota) throws IOException {
    notaFiscalService.parserToNFe(xmlNota);
  }
}