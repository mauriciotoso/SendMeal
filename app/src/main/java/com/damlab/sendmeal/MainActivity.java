package com.damlab.sendmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaNumero= findViewById(R.id.cajaNumero);
    }
    //fff

    public void BotonGuardar(View view){
        Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
    }

    public void BotonGuardar2(View view){
        Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
    }
}