package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup groupSexo;
    CheckBox check;
    String[] Opcoes = new String[]{"Opção 1", "Opção 2", "Opção 3"};
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupSexo = (RadioGroup) findViewById(R.id.groupSexo);
        check = (CheckBox) findViewById(R.id.checkBox);
        spinner = (Spinner) findViewById(R.id.Spinner);
        ArrayAdapter<String> SpinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Opcoes);
        spinner.setAdapter(SpinnerAdapter);
    }

    public void FloatButtonClick(View view) {
        //Example 1: Mocked Value
        //Toast.makeText(this, "Funcionou!", Toast.LENGTH_SHORT).show();

        //Example 2: SelectedRadio Value
        //RadioButton RadioSelecionado = (RadioButton) findViewById(groupSexo.getCheckedRadioButtonId());
        //Toast.makeText(this, RadioSelecionado.getText().toString(), Toast.LENGTH_SHORT).show();

        //Example 3: Radio + Check
        RadioButton RadioSelecionado = (RadioButton) findViewById(groupSexo.getCheckedRadioButtonId());
        String Checado = check.isChecked() ? "Sim" : "Não";
        Toast.makeText(this, Checado + " " + RadioSelecionado.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}