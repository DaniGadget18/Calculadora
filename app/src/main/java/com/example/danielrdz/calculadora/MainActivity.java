package com.example.danielrdz.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0, borrar, sumar, multiplicar, dividir, restar, igual;
    TextView pantalla;
    String pantallaconca, reserva, operador;
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        borrar = findViewById(R.id.borrar);
        multiplicar = findViewById(R.id.por);
        dividir = findViewById(R.id.division);
        sumar = findViewById(R.id.suma);
        restar = findViewById(R.id.restar);
        pantalla = findViewById(R.id.numeros);
        igual = findViewById(R.id.igual);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "1";
                pantalla.setText(pantallaconca);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "2";
                pantalla.setText(pantallaconca);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "3";
                pantalla.setText(pantallaconca);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "4";
                pantalla.setText(pantallaconca);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "5";
                pantalla.setText(pantallaconca);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "6";
                pantalla.setText(pantallaconca);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "7";
                pantalla.setText(pantallaconca);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "8";
                pantalla.setText(pantallaconca);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "9";
                pantalla.setText(pantallaconca);
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "0";
                pantalla.setText(pantallaconca);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = "";
                pantalla.setText(pantallaconca);
                operador = "";
            }
        });

        sumar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                reserva = pantalla.getText().toString();
                operador = "+";
                pantalla.setText("");
            }
        });
        restar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                reserva = pantalla.getText().toString();
                operador = "-";
                pantalla.setText("");
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                reserva = pantalla.getText().toString();
                operador = "*";
                pantalla.setText("");
            }
        });
        dividir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                reserva = pantalla.getText().toString();
                operador = "/";
                pantalla.setText("");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallaconca = pantalla.getText().toString();
                pantallaconca = pantallaconca + "1";
                if (operador.equals("+")) {
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resultado));
                }
                if (operador.equals("-")) {
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resultado));
                }
                if (operador.equals("*")) {
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resultado));
                }
                if (operador.equals("/")) {
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resultado));
                }
            }
        });
    }
}
