package com.example.userregistrationapp;

import android.content.Context; // classe que representa o contexto da aplicacao

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    // Instancia unica (singleton) do BD
    public static UserDatabase instance;

    // Metodo abstrato que sera implementado pela Room
    // Serve para acessar as operacoes do BD definidas na UserDao
    public abstract UserDao userDao();

    // Metodo que retorna a instancia do BD
    // O uso do `synchronized` garante que apenas uma thread possa acessar esta metodo por vez, evitando que duas instancias do BD sejam criadas acidentalmente
    public static synchronized UserDatabase getInstance(Context context) {
        // Verificar se ja existe uma instancia de BD
        if (instance == null) {
            // Cria a instancia do BD usando Room
            instance = Room.databaseBuilder(context.getApplicationContext(), // usando o contexto da aplicacao para evitar vazamento de memoria
                UserDatabase.class, "user-database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries().build();
        }
        // Retorna a instancia criada
        return instance;
    }
}
