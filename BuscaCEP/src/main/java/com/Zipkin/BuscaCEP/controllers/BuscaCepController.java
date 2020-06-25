package com.Zipkin.BuscaCEP.controllers;

import com.Zipkin.BuscaCEP.client.EnderecoDTO;
import com.Zipkin.BuscaCEP.services.BuscaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuscaCepController {
    @Autowired
    BuscaCepService buscaCepService;

    @GetMapping("/buscacep/{cep}")
    public EnderecoDTO consultaviacep(@PathVariable String cep){

        return buscaCepService.buscarCep(cep);
    }
}
