package com.Zipkin.CadastraUsuario.repositories;

import com.Zipkin.CadastraUsuario.models.CadastroUsuario;
import org.springframework.data.repository.CrudRepository;

public interface CadastroUsuarioRepository extends CrudRepository<CadastroUsuario, Integer> {
}
