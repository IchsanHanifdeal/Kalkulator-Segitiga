package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class L_SegitigaSamaKaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_segitigasamakaki);

        Button btnBack = findViewById(R.id.btnBack);
        Button btnHitung = findViewById(R.id.btnHitung);
        EditText etFirstNumber = findViewById(R.id.etAlas);
        EditText etSecondNumber = findViewById(R.id.etTinggi);
        EditText etHasil = findViewById(R.id.etHasil);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(L_SegitigaSamaKaki.this, SegitigaSamaKaki.class);
                startActivity(intent);
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double num1 = Double.parseDouble(etFirstNumber.getText().toString());
            double num2 = Double.parseDouble(etSecondNumber.getText().toString());
            double hasil = (num1 * num2) / 2;
            etHasil.setText("Hasil : " + hasil);
            }
        });
    }
}