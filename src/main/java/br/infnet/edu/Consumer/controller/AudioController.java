package br.infnet.edu.Consumer.controller;

import br.infnet.edu.Consumer.model.Audio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.Consumer.service.CryptoArtSaleWebService;
import java.util.Set;

@RestController
public class AudioController {
    @Autowired
    private CryptoArtSaleWebService CryptoArtSaleWebService;
    
    @GetMapping("/audio")
    public Iterable<Audio> listar(){
        return CryptoArtSaleWebService.lista();
    }
    
    @PostMapping("/audio")
    public Audio salvar(@RequestBody Audio audio){
        return CryptoArtSaleWebService.criar(audio);
    }
}
