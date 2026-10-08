package com.example.tema3layouts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Esta única orden es la encargada de dibujar tu XML en la pantalla

        //setContentView(R.layout.frame_layout);
        //setContentView(R.layout.relative_layout);
        //setContentView(R.layout.table_layout);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.grid_layout);
        setContentView(R.layout.calculadora_layout);
    }
}