package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class L_SegitigaSembarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_segitigasembarang);

        Button btnHasil = findViewById(R.id.btnHasil);
        Button btnBack = findViewById(R.id.btnBack);
        EditText etFirstNumber = findViewById(R.id.etFirstNumber);
        EditText etSecondNumber = findViewById(R.id.etSecondNumber);
        EditText etThirdNumber = findViewById(R.id.etThirdNumber);
        EditText etSemiPerimeter = findViewById(R.id.etSemiPerimeter);
        EditText etHasil = findViewById(R.id.etHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etFirstNumber.getText().toString());
                double num2 = Double.parseDouble(etSecondNumber.getText().toString());
                double num3 = Double.parseDouble(etThirdNumber.getText().toString());
                double semiperimeter = (num1 + num2 + num3) / 2;
                etSemiPerimeter.setText("S : " + semiperimeter);
                double Hasil = Math.sqrt(semiperimeter * (semiperimeter - num1) * (semiperimeter - num2) * (semiperimeter - num3));
                etHasil.setText("Hasil : " + Hasil);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(L_SegitigaSembarang.this, SegitigaSembarang.class);
                startActivity(intent);
            }
        });
    }
}