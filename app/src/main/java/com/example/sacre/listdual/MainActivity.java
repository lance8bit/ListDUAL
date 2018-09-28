package com.example.sacre.listdual;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.KeyStore;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextInputEditText nombre_input, email_input, asignaturas_input, identificador_input;
    Button add;
    ArrayList<alumno> list = new ArrayList<>();
    //RecyclerView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.buttonAdd);
        nombre_input = (TextInputEditText) findViewById(R.id.nom_input);
        email_input = (TextInputEditText) findViewById(R.id.email_input);
        asignaturas_input = (TextInputEditText) findViewById(R.id.asignaturas_input);
        identificador_input = (TextInputEditText) findViewById(R.id.identificador_input);
        //show = (RecyclerView) findViewById(R.id.showAlumn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new_Alumno();
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

            Log.i("AVISO", "new_Alumno: "+nuevoAlumno.toString());
            comprobarAlum();
            Log.i("CARGANDO", "comprobarAlum: "+comprobarAlum());

            if (comprobarAlum()== true){
                Toast.makeText(getBaseContext(),"Ya existe un alumno añadido con este identificador",Toast.LENGTH_LONG).show();
            } else {
                list.add(nuevoAlumno);
                Toast.makeText(getBaseContext(),"Alumno añadido"+"\n"+"Nombre:"+n_Alumno+"\n" +
                        "Email:"+e_Alumno+ "\n" +
                        "Asignatura:"+a_Alumno+ "\n" +
                        "Identificador:"+i_Alumno_string  ,Toast.LENGTH_LONG).show();
            }

            /*
                Toast.makeText(getBaseContext(),"El identificador esta vacio",Toast.LENGTH_LONG).show();
           */

        }
    }

    private boolean comprobarAlum(){
        String comprobante = identificador_input.getText().toString();
        int comprobante_int = Integer.parseInt(comprobante);
        boolean willReturnTrue = false;

        for (alumno indList: list){
            int currAlumnoID = indList.getId_alumno();
            if (comprobante_int == currAlumnoID ){
                willReturnTrue = true;
            }
        }
        return willReturnTrue;
    }

}
