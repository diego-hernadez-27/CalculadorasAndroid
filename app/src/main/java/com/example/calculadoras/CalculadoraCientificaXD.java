package com.example.calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class CalculadoraCientificaXD extends AppCompatActivity {

    TextView vistas, secundaria;
    String cadena = "", resultado = "0", auxi = "";
    Parseador parseador=new Parseador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cientifica_xd);

        vistas = findViewById(R.id.vistapri);
        secundaria = findViewById(R.id.vistasecundaria);
        secundaria.setMovementMethod(new ScrollingMovementMethod());

    }

    public void atras(View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }

    public void EscribirCero(View view) {
        cadena = cadena+"0";
        vistas.setText(cadena);
    }

    public void EscribirUno(View view) {
        cadena = cadena+"1";
        vistas.setText(cadena);
    }

    public void EscribirDos(View view){
        cadena = cadena+"2";
        vistas.setText(cadena);
    }

    public void EscribirTres(View view) {
        cadena = cadena+"3";
        vistas.setText(cadena);
    }

    public void EscribirCuatro(View view) {
        cadena = cadena+4;
        vistas.setText(cadena);
    }

    public void EscribirCinco(View view) {
        cadena = cadena+"5";
        vistas.setText(cadena);
    }

    public void EscribirSeis(View view) {
        cadena = cadena+"6";
        vistas.setText(cadena);
    }

    public void EscribirSiete(View view) {
        cadena = cadena+"7";
        vistas.setText(cadena);
    }

    public void EscribirOcho(View view) {
        cadena = cadena+"8";
        vistas.setText(cadena);
    }

    public void EscribirNueve(View view) {
        cadena = cadena+"9";
        vistas.setText(cadena);
    }

    public void OperacionMultiplicar(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "×";
            vistas.setText(cadena);
        }
    }

    public void OperacionSumar(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "+";
            vistas.setText(cadena);
        }
    }

    public void OperacionRestar(View view) {
        cadena = cadena+"-";
        vistas.setText(cadena);
    }

    public void OperacionDividir(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "÷";
            vistas.setText(cadena);
        }
    }

    public void OperacionModulo(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "%";
            vistas.setText(cadena);
        }
    }

    public void OperacionRaiz(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "√";
            vistas.setText(cadena);
        }
    }

    public void OperacionElevar(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "^";
            vistas.setText(cadena);
        }
    }

    public void EscribirPunto(View view) {
        cadena = cadena+".";
        vistas.setText(cadena);
    }

    public void EscribirParentesisIz(View view) {
        cadena = cadena+"(";
        vistas.setText(cadena);
    }

    public void EscribirParentesisDe(View view) {
        cadena = cadena+")";
        vistas.setText(cadena);
    }

    public void EscribirCuadrado(View view) {
        if(vistas.getText().equals("")){

        }else {
            cadena = cadena + "^2";
            vistas.setText(cadena);
        }
    }

    public void IgualA(View view){
        if(vistas.getText().equals("")){

        }else {
            String aux = parseador.parsear((String) vistas.getText());
            resultado = parseador.evaluar(aux);

            cadena = cadena + "=\n" + resultado;
            auxi = auxi + "\n" + cadena;
            secundaria.setText(auxi);
            cadena = resultado;
            vistas.setText(resultado);
        }
    }

    public void Borrar(View view){
        String aux = "";
        for(int i = 0 ; i < cadena.length() -1;i++) aux += cadena.charAt(i);
        cadena = aux;
        vistas.setText(cadena);
    }

    public void ClearAll(View view) {
        resultado = "0";
        cadena = "";
        String aux = "";
        auxi = "";
        vistas.setText(aux);
        secundaria.setText(cadena);
    }

    public void Logarito10(View view){
        if(vistas.getText().equals("")){

        }else {
            String aux = parseador.parsear((String) vistas.getText());
            resultado = parseador.evaluar(aux);

            cadena = "log(" + cadena + ")=";

            resultado = Math.log10(Float.parseFloat(resultado)) + "";
            auxi = auxi + "\n" + cadena + "\n" + resultado;
            secundaria.setText(auxi);
            cadena = resultado;
            vistas.setText(cadena);
        }
    }


    public void LogaritoN(View view){
        if(vistas.getText().equals("")){

        }else {
            String aux = parseador.parsear((String) vistas.getText());
            resultado = parseador.evaluar(aux);

            cadena = "log(" + cadena + ")=";

            resultado = Math.log(Float.parseFloat(resultado)) + "";
            auxi = auxi + "\n" + cadena + "\n" + resultado;
            secundaria.setText(auxi);
            cadena = resultado;
            vistas.setText(cadena);
        }
    }

    public void Seno(View view){
        if(vistas.getText().equals("")){

        }else {
            String aux = parseador.parsear((String) vistas.getText());
            resultado = parseador.evaluar(aux);

            cadena = "sen(" + cadena + ")=";

            resultado = Math.sin(Float.parseFloat(resultado)) + "";
            auxi = auxi + "\n" + cadena + "\n" + resultado;
            secundaria.setText(auxi);
            cadena = resultado;
            vistas.setText(cadena);
        }
    }

    public void Coseno(View view){
        if(vistas.getText().equals("")){

        }else {
            String aux = parseador.parsear((String) vistas.getText());
            resultado = parseador.evaluar(aux);

            cadena = "cos(" + cadena + ")=";

            resultado = Math.cos(Float.parseFloat(resultado)) + "";
            auxi = auxi + "\n" + cadena + "\n" + resultado;
            secundaria.setText(auxi);
            cadena = resultado;
            vistas.setText(cadena);
        }
    }

    public void Tangente(View view){
        if(vistas.getText().equals("")){

        }else {
            String aux = parseador.parsear((String) vistas.getText());
            resultado = parseador.evaluar(aux);

            cadena = "tan(" + cadena + ")=";

            resultado = Math.tan(Float.parseFloat(resultado)) + "";
            auxi = auxi + "\n" + cadena + "\n" + resultado;
            secundaria.setText(auxi);
            cadena = resultado;
            vistas.setText(cadena);
        }
    }

    public void Reciproco(View view){
        if(vistas.getText().equals("")){

        }else {
            cadena = "1÷(" + cadena + ")";
            vistas.setText(cadena);
        }
    }

}