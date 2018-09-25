package com.example.sacre.listdual;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText nombre_input = (TextInputEditText) findViewById(R.id.nom_input);
        TextInputEditText email_input = (TextInputEditText) findViewById(R.id.email_input);
        TextInputEditText asignaturas_input = (TextInputEditText) findViewById(R.id.asignaturas_input);

    }

}
