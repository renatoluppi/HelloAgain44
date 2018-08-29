package com.kiko.android.helloagain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrepg2();

            }
        });

    }

    private void abrepg2(){
        Intent intent = new Intent(this, Tela2Activity.class);
        Random rand = new Random();

        //int sorteado = rand.nextInt(60) + 1 ;
        int sorteado = rand.nextInt(6)  ;
        String numero1 = new Integer(sorteado).toString();
        intent.putExtra("KEY",numero1);


        int sorteado2 = sorteado;
        do {
            //sorteado2 = rand.nextInt(60 ) + 1
            sorteado2 = rand.nextInt(6) ;
        }while(sorteado == sorteado2);
        String numero2 = new Integer(sorteado2).toString();
        intent.putExtra("KEY2",numero2);

        int sorteado3 = sorteado2;
        do{
            //sorteado3 = rand.nextInt(60 ) + 1;
            sorteado3 = rand.nextInt(6);
        }while(sorteado3 == sorteado2 || sorteado3 == sorteado);
        String numero3 = new Integer(sorteado3).toString();
        intent.putExtra("KEY3",numero3);

        int sorteado4 = sorteado3;
        do{
            //sorteado4 = rand.nextInt(60 ) + 1;
            sorteado4 = rand.nextInt(6);
        }while(sorteado4 == sorteado3 || sorteado4 == sorteado2 || sorteado4 == sorteado);
        String numero4 = new Integer(sorteado4).toString();
        intent.putExtra("KEY4",numero4);

        int sorteado5 = sorteado4;
        do{
            //sorteado5 = rand.nextInt(60 ) + 1;
            sorteado5 = rand.nextInt(6);
        }while(sorteado5 == sorteado4 || sorteado5 == sorteado3 || sorteado5 == sorteado2 || sorteado5 == sorteado);
        String numero5 = new Integer(sorteado5).toString();
        intent.putExtra("KEY5",numero5);

        int sorteado6 = sorteado5;
        do{
            //sorteado6 = rand.nextInt(60 ) + 1;
            sorteado6 = rand.nextInt(6);
        }while(sorteado6 == sorteado5 || sorteado6 == sorteado4 || sorteado6 == sorteado3 || sorteado6 == sorteado2 || sorteado6 == sorteado);
        String numero6 = new Integer(sorteado6).toString();
        intent.putExtra("KEY6",numero6);

//todo nao pode ter numeros repetidos, criar um if equals para evitar isso
//todo no resultado colocar os numeros em ordem crescente

        startActivity(intent);
    }

}
