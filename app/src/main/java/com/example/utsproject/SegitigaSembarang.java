package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegitigaSembarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitigasembarang);

        Button btnK_Sembarang = findViewById(R.id.btn15);
        Button btnL_Sembarang = findViewById(R.id.btn16);
        Button btnBack = findViewById(R.id.btn17);

        btnK_Sembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSembarang.this, K_SegitigaSembarang.class);
                startActivity(intent);
            }
        });
        btnL_Sembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSembarang.this, L_SegitigaSembarang.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSembarang.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}