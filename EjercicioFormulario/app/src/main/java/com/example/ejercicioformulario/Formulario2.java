package com.example.ejercicioformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Formulario2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario2);
        Bundle extras = getIntent().getExtras();
        //String name = extras.getString(KEY_EXTRA_NAME);

        String nombre = extras.getString("Nombre");
        String tel = extras.getString("Telefono");
        String mail = extras.getString("Email");
        String descrip = extras.getString("DescripcionContacto");
        String fechaNac = extras.getString("FechaNacimiento");

        TextView textNombre = (TextView) findViewById(R.id.textNombre);
        TextView textTel = (TextView) findViewById(R.id.textTel);
        TextView textEmail = (TextView) findViewById(R.id.textEmail);
        TextView textDescrip = (TextView) findViewById(R.id.textDescrip);
        TextView textFecha = (TextView) findViewById(R.id.textFecha);

        textNombre.setText(nombre);
        textTel.setText(tel);
        textEmail.setText(mail);
        textDescrip.setText(descrip);
        textFecha.setText(fechaNac);
    }

    public void editDatos (View v) {
        Intent i = new Intent(this, MainActivity.class);
        finish();
    }
}