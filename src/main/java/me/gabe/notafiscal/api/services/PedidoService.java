package me.gabe.notafiscal.api.services;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import lombok.RequiredArgsConstructor;
import me.gabe.notafiscal.api.repositories.PedidoRepository;
import me.gabe.notafiscal.domain.dtos.nfe.eInfNFe;
import me.gabe.notafiscal.domain.dtos.nfe.nFeProc;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class PedidoService {

  private final PedidoRepository pedidoRepository;
  private final ItemPedidoService itemPedidoService;
  private final PessoaService pessoaService;
  private final ProdutoService produtoService;

  @Async
  public void parserToNFe(MultipartFile file) throws IOException {
    String xml = inputStreamToString(file.getInputStream());
    XStream xstream = new XStream();
    xstream.addPermission(AnyTypePermission.ANY);
    xstream.ignoreUnknownElements();
    xstream.alias("nfeProc", nFeProc.class);
    xstream.processAnnotations(eInfNFe.class);
    try {
      nFeProc nFeProc = (nFeProc) xstream.fromXML(xml);
      persistDataToDatabase(nFeProc);
    } catch (Exception e) {
      throw new IOException("arquivo.deve.ser.nfe");
    }
  }

  private void persistDataToDatabase(nFeProc nFeProc) {
    // Implemente sua lógica de persistência de dados aqui
  }

  private String inputStreamToString(InputStream is) throws IOException {
    byte[] bytes = is.readAllBytes();
    return new String(bytes, StandardCharsets.UTF_8);
  }
}
