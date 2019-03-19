package com.example.motti.apppedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
// control e clique pra ver as classes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          /*Toolbar toolbar = (Toolbar) findViewById(R.id.mCustomToolbar);
          setSupportActionBar(toolbar);
          getSupportActionBar().setTitle("");
          getSupportActionBar().setIcon(getDrawable(R.drawable.ic_jokenpo));
          */

    }
    public void opcaoSelecionada(String escolhaUsuario){
       // System.out.println( escolhaUsuario);

        ImageView imageResult = (ImageView) findViewById(R.id.imageResult);
        TextView textResult = (TextView) findViewById(R.id.textResult);

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];
        switch (escolhaApp){
            case "Pedra":
                imageResult.setImageResource(R.drawable.ic_pedra);
                break;
            case "Papel":
                imageResult.setImageResource(R.drawable.ic_papel);
                break;
            case "Tesoura" :
                imageResult.setImageResource(R.drawable.ic_tesoura);
        }

        if ((escolhaApp=="Pedra" && escolhaUsuario == "Tesoura") ||
                (escolhaApp =="Tesoura" && escolhaUsuario=="Papel") ||
                (escolhaApp =="Papel" && escolhaUsuario=="Pedra")
                ){//App Ganhar

            textResult.setText("Você Perdeu, bobão!");

        }else if ((escolhaUsuario =="Tesoura" && escolhaApp=="Papel") ||
                    (escolhaUsuario =="Pedra" && escolhaApp=="Tesoura") ||
                (escolhaUsuario =="Papel" && escolhaApp =="Pedra"))
        { // Usuario Ganhador

            textResult.setText("Cê é o bichão hein");

        }else  {
            textResult.setText("Empate sem graça");
        }
    }
    public void selecionarPedra(View view){
        this.opcaoSelecionada("Pedra");
    }
    public void selecionarPapel(View view){
        this.opcaoSelecionada("Papel");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }
}
