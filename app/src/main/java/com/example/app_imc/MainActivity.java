package com.example.app_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editpeso, editaltura;
    TextView resultadonum, resultadotx;
    RadioButton sexohomem, sexomulher;
    double peso = 0.0;
    double altura = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editpeso = findViewById(R.id.txtpeso);
        editaltura = findViewById(R.id.txtaltura);
        resultadonum = findViewById(R.id.txtresultnum);
        resultadotx = findViewById(R.id.txtresulttx);
        sexohomem = findViewById(R.id.rdbhomem);
        sexomulher = findViewById(R.id.rdbmulher);
    }

    public void CalcularIMC(View view) {
        peso = Double.parseDouble(editpeso.getText().toString());
        altura = Double.parseDouble(editaltura.getText().toString());

        double result = peso/(altura*altura);
        resultadonum.setText(Double.valueOf(result).toString());
        if (sexohomem.isChecked() == true && sexomulher.isChecked() == false) {
            if(result < 20){
                resultadotx.setText("Abaixo do normal");
            } else if(result >= 20 && result <= 24.9) {
                resultadotx.setText("Normal");
            } else if(result >= 25 && result <= 29.9){
                resultadotx.setText("Obesidade leve");
            } else if(result >= 30 && result <= 39.9) {
                resultadotx.setText("Obesidade Moderada");
            } else {
                resultadotx.setText("Obesidade Mórbida");
            }
        } else {
            if(result < 19){
                resultadotx.setText("Abaixo do normal");
            } else if(result >= 19 && result <= 23.9) {
                resultadotx.setText("Normal");
            } else if(result >= 24 && result <= 28.9){
                resultadotx.setText("Obesidade leve");
            } else if(result >= 29 && result <= 38.9) {
                resultadotx.setText("Obesidade Moderada");
            } else {
                resultadotx.setText("Obesidade Mórbida");
            }

        }
    }
}