package com.Zipkin.CadastraUsuario.controllers;

import com.Zipkin.CadastraUsuario.models.CadastroUsuario;
import com.Zipkin.CadastraUsuario.services.CadastraUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CadastraUsuarioController {
    @Autowired
    CadastraUsuarioService cadastraUsuarioService;

    @PostMapping("/cadastraruser/{nome}/{cep}")
    public CadastroUsuario cadastrarUsuario(@PathVariable String nome, @PathVariable String cep){

        return cadastraUsuarioService.cadastrarUsuario(nome, cep);
    }
    @GetMapping("/consultausuarios")
    public Iterable<CadastroUsuario> consultaUsuarios(){

        return cadastraUsuarioService.buscarTodosUsuarios();
    }
}
