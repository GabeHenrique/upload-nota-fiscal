package me.gabe.notafiscal.api.services;

import lombok.RequiredArgsConstructor;
import me.gabe.notafiscal.api.repositories.EnderecoRepository;
import me.gabe.notafiscal.api.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaService {

  private final PessoaRepository pessoaRepository;
  private final EnderecoRepository enderecoRepository;
}
