package com.example.userregistrationapp;

import androidx.room.Dao;
import  androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface UserDao {
    //Método para inserir um usuario na tabela do banco de Dados
    @Insert
    void insert(User user);

    //Método para buscar todos os usuarios cadastrados no BD
    @Query("SELECT * FROM user")
    List<User> getALLUsers();
}
