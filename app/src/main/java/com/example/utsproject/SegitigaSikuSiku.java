package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegitigaSikuSiku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitigasikusiku);

        Button btnK_SegitigaSikuSiku = findViewById(R.id.btn9);
        Button btnL_SegitigaSikuSiku = findViewById(R.id.btn10);
        Button btnBack = findViewById(R.id.btn11);

        btnK_SegitigaSikuSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSikuSiku.this, K_SegitigaSikuSiku.class);
                startActivity(intent);
            }
        });
        btnL_SegitigaSikuSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSikuSiku.this, L_SegitigaSikuSiku.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaSikuSiku.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}