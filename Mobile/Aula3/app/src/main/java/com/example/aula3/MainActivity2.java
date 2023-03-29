package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup  Q1Group;
    RadioGroup  Q2Group;
    TextView    ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Q1Group = (RadioGroup) findViewById(R.id.Q1Group);
        Q2Group = (RadioGroup) findViewById(R.id.Q2Group);
        ResultText = (TextView) findViewById(R.id.AcertosTxt);
        ResultText.setVisibility(View.INVISIBLE);
    }

    public void ChecarRespostas (View view) {

        int Acertos = 0;
        int Erros = 0;
        //Pegar String de resposta
        RadioButton Q1RespostaSelecionado = (RadioButton) findViewById(Q1Group.getCheckedRadioButtonId());
        String R1 = Q1RespostaSelecionado.getText().toString();

        //Comparar String com resposta correta
        if(R1.equals("Ouro")) {
            Acertos++;
            Q1RespostaSelecionado.setBackgroundColor(Color.GREEN);
        } else {
            Erros++;
            Q1RespostaSelecionado.setBackgroundColor(Color.RED);
        }

        //Editar componentes (cor etc)
        RadioButton Q2RespostaSelecionado = (RadioButton) findViewById(Q2Group.getCheckedRadioButtonId());
        String R2 = Q2RespostaSelecionado.getText().toString();

        if(R2.equals("Batalha de Waterloo")) {
            Acertos++;
            Q2RespostaSelecionado.setBackgroundColor(Color.GREEN);
        } else {
            Erros++;
            Q2RespostaSelecionado.setBackgroundColor(Color.RED);
        }

        ResultText.setText("Acertos: " + Acertos + " Erros: " + Erros);
        ResultText.setVisibility(View.VISIBLE);
    }
}