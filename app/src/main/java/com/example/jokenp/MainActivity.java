package com.example.jokenp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");

    }
    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");

    }
    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");

    }
    void opcaoSelecionada(String opcaoSelecionada){
        ImageView imagemAI = findViewById(R.id.imagemEscolhaDaAI);
        TextView textoresultado = findViewById(R.id.textResultado);
        int escolhaAI = new Random().nextInt(3);
        String [] opcoes = {"Pedra","Papel","Tesoura" };
        String escolhaApp = opcoes[escolhaAI];
        switch (escolhaApp){
            case "Pedra" :
                imagemAI.setImageResource(R.drawable.pedra);
                break;
            case "Papel" :
                imagemAI.setImageResource(R.drawable.papel);
                break;
            case "Tesoura" :
                imagemAI.setImageResource(R.drawable.tesoura);
                break;
        }
        if (opcaoSelecionada == "Pedra" && escolhaApp == "Tesoura" ||
            opcaoSelecionada == "Papel" && escolhaApp == "Pedra" ||
            opcaoSelecionada == "Tesoura" && escolhaApp == "Papel"){
            textoresultado.setText("Você Ganhou!");

        }
        else if(escolhaApp == "Pedra" && opcaoSelecionada == "Tesoura" ||
                escolhaApp == "Papel" && opcaoSelecionada == "Pedra" ||
                escolhaApp == "Tesoura" && opcaoSelecionada == "Papel"){
            textoresultado.setText("Você Perdeu!");

        }
        else{
            textoresultado.setText("Isso é um empate?");

        };

    }

}