package com.example.sacre.listdual;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    TextInputEditText nombre_input, email_input, asignaturas_input, identificador_input;
    Button add;
    ArrayList<alumno> list = new ArrayList<alumno>();
    RecyclerView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.buttonAdd);
        nombre_input = (TextInputEditText) findViewById(R.id.nom_input);
        email_input = (TextInputEditText) findViewById(R.id.email_input);
        asignaturas_input = (TextInputEditText) findViewById(R.id.asignaturas_input);
        identificador_input = (TextInputEditText) findViewById(R.id.identificador_input);
        show = (RecyclerView) findViewById(R.id.showAlumn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new_Alumno();
                if (list.contains(identificador_input)){
                    Toast.makeText(getBaseContext(),"Ya existe un alumno añadido con este identificador",Toast.LENGTH_LONG).show();
                } else if (identificador_input == null){
                    Toast.makeText(getBaseContext(),"El identificador esta vacio",Toast.LENGTH_LONG).show();
                } else {

                }

            }
        });
    }

    private void new_Alumno() {
        String n_Alumno = nombre_input.getText().toString();
        String e_Alumno = email_input.getText().toString();
        String a_Alumno = asignaturas_input.getText().toString();
        String i_Alumno_string = identificador_input.getText().toString();
        int i_Alumno = Integer.parseInt(i_Alumno_string);

        if (n_Alumno == null){
            Toast.makeText(getBaseContext(),"Falta añadir el nombre del alumno", Toast.LENGTH_LONG).show();
        } else if (e_Alumno == null){
            Toast.makeText(getBaseContext(),"Falta añadir el email del alumno", Toast.LENGTH_LONG).show();
        } else if (a_Alumno == null){
            Toast.makeText(getBaseContext(),"Falta añadir la asignatura al alumno", Toast.LENGTH_LONG).show();
        } else if (i_Alumno_string == null){
            Toast.makeText(getBaseContext(),"Falta añadir el identificador del alumno", Toast.LENGTH_LONG).show();
        } else {
            alumno nuevoAlumno = new alumno(i_Alumno,a_Alumno,n_Alumno,e_Alumno);
            list.add(nuevoAlumno);



            Toast.makeText(getBaseContext(),"Alumno añadido"+"\n"+"Nombre:"+n_Alumno+"\n" +
                    "Email:"+e_Alumno+ "\n" +
                    "Asignatura:"+a_Alumno+ "\n" +
                    "Identificador:"+i_Alumno_string  ,Toast.LENGTH_LONG).show();
        }
    }


}
