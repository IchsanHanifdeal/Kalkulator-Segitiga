package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegitigaSamaSisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitigasamasisi);

        Button btnK_SegitigaSamaSisi = findViewById(R.id.btn12);
        Button btnL_SegitigaSamaSisi = findViewById(R.id.btn13);
        Button btnBack = findViewById(R.id.btn14);

        btnK_SegitigaSamaSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSamaSisi.this, K_SegitigaSamaSisi.class);
                startActivity(intent);
            }
        });
        btnL_SegitigaSamaSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSamaSisi.this, L_SegitigaSamaSisi.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSamaSisi.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}