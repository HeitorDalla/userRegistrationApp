package com.example.userregistrationapp;

import  androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

public interface UserDao {
    //Método para inserir um usuario na tabela do banco de Dados
    // A anotaçao @insert informa que este metodo deve ser usado para inserir dado

    @Insert
    void insert(User user);

    //Método para buscar todos os usuarios cadastrados no BD
    //A anotação @Query permite define um consulta SQl personalizar
    @Query("SELECT * FROM user")
    List<User> getALLUsers();
}
