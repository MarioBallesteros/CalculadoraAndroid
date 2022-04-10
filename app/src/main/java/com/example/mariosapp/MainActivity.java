package com.example.mariosapp;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonmas,botonmenos,botonmult,botondiv,botonigual,botonpunto, botonC,botonreturn;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton rSuma,rResta,rMult,rDiv;
    private TextView textView;
    private String aux = "";
    private String aux2 = "";
    private char operacion;
    private boolean pass=false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);


        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        boton0 = findViewById(R.id.boton0);

        botonmas = findViewById(R.id.botonmas);
        botonmenos = findViewById(R.id.botonmenos);
        botonmult = findViewById(R.id.botonmult);
        botondiv = findViewById(R.id.botondiv);
        botonigual = findViewById(R.id.botonigual);
        botonpunto = findViewById(R.id.botonpunto);
        botonC = findViewById(R.id.botonC);
        botonreturn = findViewById(R.id.botonreturn);

        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        rSuma = findViewById(R.id.rSuma);
        rResta = findViewById(R.id.rResta);
        rMult = findViewById(R.id.rMult);
        rDiv = findViewById(R.id.rDiv);

        textView = findViewById(R.id.textView5);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        boton0.setOnClickListener(this);
        botonmas.setOnClickListener(this);
        botonmenos.setOnClickListener(this);
        botonmult.setOnClickListener(this);
        botondiv.setOnClickListener(this);
        botonigual.setOnClickListener(this);
        botonpunto.setOnClickListener(this);
        botonC.setOnClickListener(this);
        botonreturn.setOnClickListener(this);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    radioGroup.setVisibility(VISIBLE);
                else {
                    radioGroup.setVisibility(GONE);
                    rSuma.setChecked(false);
                    botonmas.setEnabled(true);
                    rResta.setChecked(false);
                    botonmenos.setEnabled(true);
                    rMult.setChecked(false);
                    botonmult.setEnabled(true);
                    rDiv.setChecked(false);
                    botondiv.setEnabled(true);
                }
            }
        });
    }

    public void onRadioClick(View view){
        if (view instanceof RadioButton){
            RadioButton radioButton = (RadioButton) view;

            if (radioButton == rSuma){
                botonmas.setEnabled(false);
                botonmenos.setEnabled(true);
                botonmult.setEnabled(true);
                botondiv.setEnabled(true);
            } else if (radioButton == rResta){
                botonmas.setEnabled(true);
                botonmenos.setEnabled(false);
                botonmult.setEnabled(true);
                botondiv.setEnabled(true);
            }else if (radioButton==rMult){
                botonmas.setEnabled(true);
                botonmenos.setEnabled(true);
                botonmult.setEnabled(false);
                botondiv.setEnabled(true);
            }else if (radioButton==rDiv){
                botonmas.setEnabled(true);
                botonmenos.setEnabled(true);
                botonmult.setEnabled(true);
                botondiv.setEnabled(false);
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (view instanceof Button) {
            Button b = (Button) view;
            if (b.getId() == boton1.getId()) {
                if (!pass) {
                    aux += "1";
                } else {
                    textView.setText(aux2);
                    aux2+="1";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton2.getId()) {
                if (!pass) {
                    aux += "2";
                } else {
                    textView.setText(aux2);
                    aux2+="2";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton3.getId()) {
                if (!pass) {
                    aux += "3";
                } else {
                    textView.setText(aux2);
                    aux2+="3";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton4.getId()) {
                if (!pass) {
                    aux += "4";
                } else {
                    textView.setText(aux2);
                    aux2+="4";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton5.getId()) {
                if (!pass) {
                    aux += "5";
                } else {
                    textView.setText(aux2);
                    aux2+="5";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton6.getId()) {
                if (!pass) {
                    aux += "6";
                } else {
                    textView.setText(aux2);
                    aux2+="6";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton7.getId()) {
                if (!pass) {
                    aux += "7";
                } else {
                    textView.setText(aux2);
                    aux2+="7";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton8.getId()) {
                if (!pass) {
                    aux += "8";
                } else {
                    textView.setText(aux2);
                    aux2+="8";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton9.getId()) {
                if (!pass) {
                    aux += "9";
                } else {
                    textView.setText(aux2);
                    aux2+="9";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton0.getId()) {
                if (!pass) {
                    aux += "0";
                } else {
                    textView.setText(aux2);
                    aux2+="0";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == botonpunto.getId()) {
                if (!pass) {
                    aux += ".";
                } else {
                    textView.setText(aux2);
                    aux2+=".";
                    aux=operacionIgual(aux,aux2,operacion);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == botonmas.getId()) {
                if (!pass) {
                    operacion='+';
                    pass = true;
                }
            }
            if (b.getId() == botonmenos.getId()) {
                if (!pass) {
                    operacion='-';
                    pass = true;
                }
            }
            if (b.getId() == botonmult.getId()) {
                if (!pass) {
                    operacion='*';
                    pass = true;
                }
            }
            if (b.getId() == botondiv.getId()) {
                if (!pass) {
                    operacion='/';
                    pass = true;
                }
            }
            if (b.getId() == botonigual.getId()) {
                aux = operacionIgual(aux,aux2,operacion);
            }
            if (b.getId() == botonC.getId()) {
                aux = "";
            }
            if (b.getId() == botonreturn.getId()) {
                if (!pass)
                    aux = operacionReturn(aux);
                else
                    aux2 = operacionReturn(aux2);
            }
            if (!pass) {
                textView.setText(aux);
            } else{
                textView.setText(aux2);
                aux2="";
            }
        }
        System.out.println("prim"+aux);
        System.out.println("seg"+aux2);
    }
    private String operacionReturn(String aux) {
        String newaux="";
        for (int i = 0; i < aux.length()-1; i++) {
            newaux+=aux.charAt(i);
        }
        return newaux;
    }

    private String operacionIgual(String aux,String aux2,char operacion) {
        char suma = '+',resta='-',mult='*',div='/';

        float primPart;
        float segPart;

        primPart= Float.parseFloat(aux);
        segPart = Float.parseFloat(aux2);
        System.out.println(primPart*segPart+" mult");
        if (operacion==suma)
            return primPart+segPart+"";
        else if (operacion==resta)
            return primPart-segPart+"";
        else if (operacion==mult)
            return primPart*segPart+"";
        else if (operacion==div)
            return primPart/segPart+"";
        else
            return primPart+segPart+"";
    }

}