package com.example.userregistrationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.room.Room;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ReportActivity extends AppCompatActivity {
    // Campo de texto onde os dados do banco serao exibidos
    private TextView textViewReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout XML dessa tela de relatorio
        setContentView(R.layout.activity_report);
        // Mapeamento do TextView do XML para o java
        textViewReport = findViewById(R.id.textViewReport);
        // Encontra o botao e define o clique para voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        // O botao de retorno utilizando expressao lambda
        btnVoltar.setOnClickListener(v -> voltarParaCadastro());

        /*
            Conexao com o banco de dados
            1 - Cria uma instancia do banco "user-database"
            2 - .allowMainThreadQueries() : Serve para liberar operacoes de consulta feitas em threads da UI.
            Por padrao, ROOM proibe isso. O correto seria fazer consultas em threads separadas
        */
        UserDatabase db = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "user-database").allowMainThreadQueries().build();

        // Obtem o objeto DAO que contem as queries SQL
        UserDao userDao = db.userDao();

        // Recupera todos os usuarios salvos no banco e armazena em uma instancia
        List<User> userList = userDao.getALLUsers();

        // StringBuilder: forma eficiente de construir uma String longa dentro de um Loop
        StringBuilder report = new StringBuilder();

        // Loop "for-each" para percorrer cada objeto User dentro da lista recuperada
        for (User user : userList) {
            report.append("Nome: ").append(user.getName())
                    .append("\n").append("CPF: ").append(user.getCPF())
                    .append("\n\n");
        }

        // Exibe o relatorio final montado na TextView da tela
        textViewReport.setText(report.toString());
    }

    // Metodo responsavel pela navegacao entre as telas do app
    public void voltarParaCadastro() {
        // Intent para abrir a tela de cadastro
        Intent intent = new Intent(ReportActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // fecha a tela de relatorio para nao acumular na pilha de terefas
    }
}
