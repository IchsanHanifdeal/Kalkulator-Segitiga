package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class L_SegitigaSikuSiku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_segitigasikusiku);

        Button btnBack = findViewById(R.id.btnBack);
        Button btnHitung = findViewById(R.id.btnHitung);
        EditText etAlas = findViewById(R.id.etAlas);
        EditText etTinggi = findViewById(R.id.etTinggi);
        EditText etHasil = findViewById(R.id.etHasil);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(L_SegitigaSikuSiku.this, SegitigaSikuSiku.class);
                startActivity(intent);
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etAlas.getText().toString());
                double num2 = Double.parseDouble(etTinggi.getText().toString());
                double hasil = (num1 * num2) / 2;
                etHasil.setText("Hasil : " + hasil);
            }
        });
    }
}