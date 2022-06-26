package com.example.app0306;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    TextView txtresultado;
    int n1;
    int n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) { /*FUNÇÕES NO ONCREATE*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.n1);
        edit2 = findViewById(R.id.n2);
        txtresultado = findViewById(R.id.txt1);
    }
    public void Calcula(View view) {
        n1 = Integer.parseInt(edit1.getText().toString());
        n2 = Integer.parseInt(edit2.getText().toString());
        int resultado = n1+n2;
        txtresultado.setText(Integer.valueOf(resultado).toString());
    }
    public void Calcula2(View view) {
        n1 = Integer.parseInt(edit1.getText().toString());
        n2 = Integer.parseInt(edit2.getText().toString());
        int resultado = n1-n2;
        txtresultado.setText(Integer.valueOf(resultado).toString());
    }
    public void Calcula3(View view) {
        n1 = Integer.parseInt(edit1.getText().toString());
        n2 = Integer.parseInt(edit2.getText().toString());
        int resultado = n1*n2;
        txtresultado.setText(Integer.valueOf(resultado).toString());
    }
    public void Calcula4(View view) {
        n1 = Integer.parseInt(edit1.getText().toString());
        n2 = Integer.parseInt(edit2.getText().toString());
        int resultado = n1/n2;
        txtresultado.setText(Integer.valueOf(resultado).toString());
    }

}