package br.infnet.edu.Consumer.service;

import br.infnet.edu.Consumer.model.Audio;
import java.util.Set;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url= "http://localhost:8080/api/audio", name = "cryptoArtSaleWeb")
public interface CryptoArtSaleWebService {
    
    @GetMapping("/")
    Set<Audio> lista();
    
    @PostMapping("/")
    Audio criar(Audio audio);
}
