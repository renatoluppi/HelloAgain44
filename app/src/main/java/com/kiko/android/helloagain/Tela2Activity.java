package com.kiko.android.helloagain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);


        TextView textoRecebe = (TextView) findViewById(R.id.textoRecebe);
        TextView textoRecebe2 = (TextView) findViewById(R.id.textoRecebe2);
        TextView textoRecebe3 = (TextView) findViewById(R.id.textoRecebe3);
        TextView textoRecebe4 = (TextView) findViewById(R.id.textoRecebe4);
        TextView textoRecebe5 = (TextView) findViewById(R.id.textoRecebe5);
        TextView textoRecebe6 = (TextView) findViewById(R.id.textoRecebe6);



        Intent intent = getIntent();

        textoRecebe.setText(intent.getStringExtra("KEY" ));
        textoRecebe2.setText(intent.getStringExtra("KEY2" ));
        textoRecebe3.setText(intent.getStringExtra("KEY3" ));
        textoRecebe4.setText(intent.getStringExtra("KEY4" ));
        textoRecebe5.setText(intent.getStringExtra("KEY5" ));
        textoRecebe6.setText(intent.getStringExtra("KEY6" ));

    }
}
