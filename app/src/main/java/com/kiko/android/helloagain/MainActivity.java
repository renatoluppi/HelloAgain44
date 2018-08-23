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
        int sorteado = rand.nextInt(60 - 1);
        String numero1 = new Integer(sorteado).toString();

        intent.putExtra("KEY",numero1);
        startActivity(intent);
    }

}
