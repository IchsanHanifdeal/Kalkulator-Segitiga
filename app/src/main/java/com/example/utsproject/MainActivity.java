package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSegitigaSikuSiku = findViewById(R.id.btn1);
        Button btnSegitigaSamaKaki = findViewById(R.id.btn2);
        Button btnSegitigaSamaSisi = findViewById(R.id.btn3);
        Button btnSegitigaSembarang = findViewById(R.id.btn4);
        Button btnExit = findViewById(R.id.btn5);

        btnSegitigaSikuSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegitigaSikuSiku.class);
                startActivity(intent);
            }
        });
        btnSegitigaSamaKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegitigaSamaKaki.class);
                startActivity(intent);
            }
        });
        btnSegitigaSamaSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegitigaSamaSisi.class);
                startActivity(intent);
            }
        });
        btnSegitigaSembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegitigaSembarang.class);
                startActivity(intent);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               System.exit(0);
            }
        });
    }
}