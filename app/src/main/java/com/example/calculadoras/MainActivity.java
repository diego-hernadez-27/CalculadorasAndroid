package com.example.calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView vistas, secundario;
    float numero1 = 0.0f, numero2 = 0.0f, resultado;
    String cadena = "", funciones, tipoOperaciones;
    private boolean inicio = true, igual, operacion1, operacion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vistas = findViewById(R.id.vistas);
        secundario = findViewById(R.id.secundario);
    }

    public void siguiente(View view){
        Intent siguiente = new Intent(this, CalculadoraCientificaXD.class);
        startActivity(siguiente);
    }

    public void EscribirUno(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("1");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "1");
        }
    }

    public void EscribirCero(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("0");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "0");
        }
    }

    public void EscribirDos(View view){
        if(inicio){
            vistas.setText("");
            vistas.setText("2");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("3");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "3");
        }
    }

    public void EscribirCuatro(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("4");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("5");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("6");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "6");
        }
    }

    public void EscribirSiete(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("7");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("8");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        if(inicio){
            vistas.setText("");
            vistas.setText("9");
            inicio = false;
        }else{
            vistas.setText(vistas.getText() + "9");
        }
    }

    public void EscribirPunto(View view) {
        if(vistas.getText().toString().contains(".")){

        }else{
            vistas.setText(vistas.getText() + ".");
            inicio = false;
        }
    }

    public void ClearTodo(View view) {
        vistas.setText("0");
        secundario.setText("");
        inicio = true;
        operacion1 = true;
        operacion2 = true;
        igual = true;
        numero1 = 0;
        numero2 = 0;
        tipoOperaciones = "";
        resultado = 0;
    }



    public void OperacionDividir(View view) {
        igual = true;
        inicio = true;
        if(operacion1 = true){
            numero1 = Float.parseFloat(vistas.getText().toString());
            secundario.setText("");
            secundario.setText(vistas.getText() + "÷");
            operacion1 = false;
            vistas.setText("0");
        }else if(operacion2 = true){
            numero2 = Float.parseFloat(vistas.getText().toString());
            secundario.setText(vistas.getText() + "÷");
            operacion2 = false;
        }else{
            secundario.setText(vistas.getText() + "÷");
            Operaciones(resultado, numero2);
        }
        tipoOperaciones = "/";
    }

    public void OperacionMultiplicar(View view) {
        igual = true;
        inicio = true;
        if(operacion1 = true){
            numero1 = Float.parseFloat(vistas.getText().toString());
            secundario.setText("");
            secundario.setText(vistas.getText() + "×");
            operacion1 = false;
            vistas.setText("0");
        }else if(operacion2 = true){
            numero2 = Float.parseFloat(vistas.getText().toString());
            secundario.setText(vistas.getText() + "×");
            operacion2 = false;
        }else{
            secundario.setText(vistas.getText() + "×");
            Operaciones(resultado, numero2);
        }
        tipoOperaciones = "*";
    }

    public void OperacionSumar(View view) {
        igual = true;
        inicio = true;
        if(operacion1 = true){
            numero1 = Float.parseFloat(vistas.getText().toString());
            secundario.setText("");
            secundario.setText(vistas.getText() + "+");
            operacion1 = false;
            vistas.setText("0");
        }else if(operacion2 = true){
            numero2 = Float.parseFloat(vistas.getText().toString());
            secundario.setText(vistas.getText() + "+");
            operacion2 = false;
        }else{
            secundario.setText(vistas.getText() + "+");
            Operaciones(resultado, numero2);
        }
        tipoOperaciones = "+";
    }

    public void OperacionRestar(View view) {
        igual = true;
        inicio = true;
        if(operacion1 = true){
            numero1 = Float.parseFloat(vistas.getText().toString());
            secundario.setText("");
            secundario.setText(vistas.getText() + "-");
            operacion1 = false;
            vistas.setText("0");
        }else if(operacion2 = true){
            numero2 = Float.parseFloat(vistas.getText().toString());
            secundario.setText(vistas.getText() + "-");
            operacion2 = false;
        }else{
            secundario.setText(vistas.getText() + "-");
            Operaciones(resultado, numero2);
        }
        tipoOperaciones = "-";
    }

    public void OperacionElevar(View view){
        inicio = true;
        numero1 = Float.parseFloat(vistas.getText().toString());
        secundario.setText("");
        secundario.setText(vistas.getText() + "^");
        vistas.setText("0");
        tipoOperaciones = "^";
        operacion1 = false;
        vistas.setText("0");
        igual = true;
    }

    public void OperacionRaiz(View view) {
        inicio = true;
        numero1 = Float.parseFloat(vistas.getText().toString());
        secundario.setText("");
        secundario.setText(vistas.getText() + "√");
        vistas.setText("0");
        tipoOperaciones = "√";
        operacion1 = false;
        igual = true;
    }

    private void Operaciones(float valor1, float valor2){
        switch(tipoOperaciones) {
            case "+":
                resultado = valor1 + valor2;
                vistas.setText(resultado + "");
                numero1 = Float.parseFloat(vistas.getText().toString());
                break;
            case "-":
                resultado = valor1 - valor2;
                vistas.setText(resultado + "");
                numero1 = Float.parseFloat(vistas.getText().toString());
                break;
            case "*":
                resultado = valor1 * valor2;
                vistas.setText(resultado + "");
                numero1 = Float.parseFloat(vistas.getText().toString());
                break;
            case "/":
                if(valor2 == 0){
                    vistas.setText("Error");
                    break;
                }else {
                    resultado = valor1 / valor2;
                    vistas.setText(resultado + "");
                    numero1 = Float.parseFloat(vistas.getText().toString());
                    break;}
            case "^":
                if(valor1 == 0){
                    vistas.setText("Error");
                    break;
                }else{
                    resultado = (float) Math.pow(valor1, valor2);
                    vistas.setText(resultado + "");
                    break;
                }
            case "√":
                if(valor1 <= 0){
                    vistas.setText("Error");
                    break;
                }else{
                    vistas.setText(valor1 + "√");
                    resultado = (float) Math.pow(valor2, 1/valor1);
                    DecimalFormat df = new DecimalFormat("#.0000");
                    vistas.setText(df.format(resultado));
                    break;
                }
        }
    }


    public void IgualA(View view) {
        inicio = true;
        operacion1 = true;

        if(igual = true){
            if(tipoOperaciones == null){

            }else{
                numero2 = Float.parseFloat(vistas.getText().toString());
                secundario.setText(secundario.getText().toString() + vistas.getText().toString());
                Operaciones(numero1, numero2);
                igual = false;
            }
        }else{
            secundario.setText("");
            Operaciones(numero1, numero2);
        }
    }


    public void Retroseso(View view) {
        if(vistas.getText().toString().length() > 1){
            vistas.setText(vistas.getText().toString().substring(0, vistas.getText().toString().length() - 1));
        }else if(vistas.getText().toString().length() == 1){
            vistas.setText("0");
            inicio =true;
        }
    }

}