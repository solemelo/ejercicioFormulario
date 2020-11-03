package com.example.ejercicioformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irDetalleContacto(View v){
        Intent i = new Intent(this, Formulario2.class);

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        EditText editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText editTextTextMultiLine = (EditText) findViewById(R.id.editTextTextMultiLine);
        DatePicker datePic = (DatePicker) findViewById(R.id.datePic);

        String nombre = editTextTextPersonName.getText().toString();
        String tel = editTextPhone.getText().toString();
        String mail = editTextTextEmailAddress.getText().toString();
        String descrip = editTextTextMultiLine.getText().toString();

        int day = datePic.getDayOfMonth();
        int month = datePic.getMonth();
        int year = datePic.getYear();
        String FechaNac = dividirFecha(day) + "/" + dividirFecha(month+1) + "/" + year;

        i.putExtra("Nombre", nombre);
        i.putExtra("Telefono", tel);
        i.putExtra("Email", mail);
        i.putExtra("Descripcion", descrip);
        i.putExtra("FechaNacimiento", FechaNac);

        startActivity(i);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private String dividirFecha(int n) {
        return (n<=9) ? ("0"+n) : String.valueOf(n);
    }

}