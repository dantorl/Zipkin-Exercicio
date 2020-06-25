package com.Zipkin.CadastraUsuario.services;

import com.Zipkin.CadastraUsuario.client.BuscaCepClient;
import com.Zipkin.CadastraUsuario.client.EnderecoDTO;
import com.Zipkin.CadastraUsuario.models.CadastroUsuario;
import com.Zipkin.CadastraUsuario.repositories.CadastroUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastraUsuarioService {
    @Autowired
    BuscaCepClient buscaCepClient;

    @Autowired
    CadastroUsuarioRepository cadastroUsuarioRepository;


    public CadastroUsuario cadastrarUsuario(String nome, String cep) {
        EnderecoDTO endereco = buscaCepClient.getByCep(cep);
        CadastroUsuario usuario = new CadastroUsuario();

        usuario.setNome(nome);
        usuario.setCep(endereco.getCep());
        usuario.setLogradouro(endereco.getLogradouro());
        usuario.setComplemento(endereco.getComplemento());
        usuario.setBairro(endereco.getBairro());
        usuario.setUf(endereco.getUf());
        usuario.setLocalidade(endereco.getLocalidade());
        cadastroUsuarioRepository.save(usuario);

        return usuario;
    }

    public Iterable<CadastroUsuario> buscarTodosUsuarios() {
        return cadastroUsuarioRepository.findAll();
    }
}
