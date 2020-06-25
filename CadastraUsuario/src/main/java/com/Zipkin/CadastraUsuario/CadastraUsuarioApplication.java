package com.Zipkin.CadastraUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CadastraUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastraUsuarioApplication.class, args);
	}

}
