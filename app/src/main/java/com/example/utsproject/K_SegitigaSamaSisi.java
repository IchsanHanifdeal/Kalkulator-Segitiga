package com.example.utsproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class K_SegitigaSamaSisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k_segitigasamasisi);
        Button btn_Back = findViewById(R.id.btnBack);
        Button btn_Hasil = findViewById(R.id.btnHasil);
        EditText et_FirstNumber = findViewById(R.id.etFirstNumber);
        EditText et_Hasil = findViewById(R.id.etHasil);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(K_SegitigaSamaSisi.this, SegitigaSamaSisi.class);
                startActivity(intent);
            }
        });
        btn_Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(et_FirstNumber.getText().toString());
                int Hasil = num1 * 3;
                et_Hasil.setText("Hasil: " + Hasil);
            }
        });
    }
}