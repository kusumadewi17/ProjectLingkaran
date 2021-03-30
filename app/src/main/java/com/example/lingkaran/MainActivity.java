package com.example.lingkaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtjari;
    private Button btnHitung;
    private TextView tvLuas;
    private TextView tvKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtjari = findViewById(R.id.edt_jari);
        btnHitung = findViewById(R.id.btn_hitung);
        tvLuas = findViewById(R.id.tv_luas);
        tvKeliling = findViewById(R.id.tv_keliling);


        btnHitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double pi;
        pi = 3.14;

        if (v.getId() == R.id.btn_hitung) {
            String inputJari = edtjari.getText().toString().trim();

            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(inputJari)) {
                isEmptyFields = true;
                edtjari.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                double luas = pi * Double.valueOf(inputJari) * Double.valueOf(inputJari);
                tvLuas.setText(String.valueOf(luas));

                double keliling = 2 * pi * Double.valueOf(inputJari);
                tvKeliling.setText(String.valueOf(keliling));
            }
        }
    }
}