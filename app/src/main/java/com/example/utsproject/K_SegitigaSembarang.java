package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class K_SegitigaSembarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k_segitigasembarang);

        Button btn_Back = findViewById(R.id.btnBack);
        Button btn_Hasil = findViewById(R.id.btnHasil);
        EditText et_FirstNumber = findViewById(R.id.etFirstNumber);
        EditText et_SecondNumber = findViewById(R.id.etSecondNumber);
        EditText et_ThirdNumber = findViewById(R.id.etThirdNumber);
        EditText et_Hasil = findViewById(R.id.etHasil);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(K_SegitigaSembarang.this, SegitigaSembarang.class);
                startActivity(intent);
            }
        });
        btn_Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(et_FirstNumber.getText().toString());
                int num2 = Integer.parseInt(et_SecondNumber.getText().toString());
                int num3 = Integer.parseInt(et_ThirdNumber.getText().toString());
                int Hasil = num1 + num2 + num3;
                et_Hasil.setText("Hasil: " + Hasil);
            }
        });
    }
}