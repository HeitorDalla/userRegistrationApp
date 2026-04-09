package com.example.userregistrationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    // Metodo responsavel pela navegacao entre as telas do app
    public void voltarParaCadastro() {
        // Intent para abrir a tela de cadastro
        Intent intent = new Intent(ReportActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // fecha a tela de relatorio para nao acumular na pilha de terefas
    }
}
