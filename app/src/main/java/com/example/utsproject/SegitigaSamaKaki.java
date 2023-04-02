package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class SegitigaSamaKaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitigasamakaki);

        Button btnK_SegitigaSamaKaki = findViewById(R.id.btn6);
        Button btnL_SegitigaSamaKaki = findViewById(R.id.btn7);
        Button btnBack = findViewById(R.id.btn8);

        btnK_SegitigaSamaKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSamaKaki.this, K_SegitigaSamaKaki.class);
                startActivity(intent);
            }
        });
        btnL_SegitigaSamaKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSamaKaki.this, L_SegitigaSamaKaki.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSamaKaki.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}