package com.example.exemplojdbc;

import java.util.List;

import com.example.exemplojdbc.Model.Usuario;
import com.example.exemplojdbc.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExemplojdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplojdbcApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(@Autowired UsuarioRepository usuarioRepository){
	 return args ->{
	 	  usuarioRepository.Inserir(new Usuario(5,"Lucas Cabral","lucas@teste","123"));
		  usuarioRepository.Inserir(new Usuario(0,"Teste","teste@teste","123"));
	 	  List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
		  Usuario userUpdate = new Usuario(1,"Teste","teste@teste","123");
		  Usuario usuarioVerificar = new Usuario();
		  usuarioVerificar.setEmail("lucas@teste");
		  usuarioVerificar.setSenha("123");
		  usuarioRepository.Editar(userUpdate);

		  usuarioRepository.Remover(userUpdate);
		  usuarioRepository.Remover(0);
		  Usuario usuarioAutenticado = usuarioRepository.autenticar(usuarioVerificar);
		  listaUsuarios.forEach(System.out::println);

		  System.out.print("Usuário autenticado \n"+usuarioAutenticado.toString());
	 	
	 };
 	}


	

}
