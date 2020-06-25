package com.Zipkin.BuscaCEP.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "buscacep", url = "https://viacep.com.br/ws")
public interface BuscaCepClient {
    @GetMapping("/{cep}/json")
    EnderecoDTO getByCep(@PathVariable String cep);
}
