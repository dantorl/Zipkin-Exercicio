package com.Zipkin.BuscaCEP.services;

import com.Zipkin.BuscaCEP.client.BuscaCepClient;
import com.Zipkin.BuscaCEP.client.EnderecoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscaCepService {
    @Autowired
    BuscaCepClient buscaCepClient;

    public EnderecoDTO buscarCep(String cep) {
        return buscaCepClient.getByCep(cep);
    }

}
