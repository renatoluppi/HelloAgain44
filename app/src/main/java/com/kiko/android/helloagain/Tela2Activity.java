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


        Intent intent = getIntent();


        textoRecebe.setText(intent.getStringExtra("KEY"));
    }
}
