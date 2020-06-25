package com.Zipkin.CadastraUsuario.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "buscacep")
public interface BuscaCepClient {
    @GetMapping("/buscacep/{cep}")
    EnderecoDTO getByCep(@PathVariable String cep);
}
