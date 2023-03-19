package com.example.exemplojdbc.Repository;



import java.util.List;

import com.example.exemplojdbc.Model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    private static String SELECT_ALL = "Select * from Usuario";

    private static String INSERT = "INSERT INTO Usuario (nome,email,senha) VALUES (?,?,?)";

    private static String DELETE = "DELETE FROM Usuario WHERE id = ?";
    private static String EDIT = "UPDATE Usuario SET nome = ?, email = ?, senha = ? WHERE id = ?";

    private static String AUTENTICAR = "SELECT * FROM Usuario WHERE email = ? and senha = ?";


    
    @Autowired
    private JdbcTemplate jdbc;


    public Usuario Inserir(Usuario usuario){
        jdbc.update(INSERT,new Object[]{usuario.getNome(), usuario.getEmail(), usuario.getSenha()});
        return usuario;

    }


    public void Remover(int id){
        jdbc.update(DELETE,new Object[]{id});
        
    }

    public void Remover(Usuario usuario){
        jdbc.update(DELETE,new Object[]{usuario.getId()});
        
    }

    public void Editar(Usuario usuario){
        jdbc.update(EDIT,new Object[]{usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getId()});
        
    }

    public Usuario autenticar(Usuario usuario) {
       
        return jdbc.query(AUTENTICAR,new Object[]{usuario.getEmail(), usuario.getSenha()}, Usuario.getRowMapper()).get(0);

    }

    public List<Usuario> obterTodos(){
       return jdbc.query(SELECT_ALL, Usuario.getRowMapper());
    }
        


        
        
}
