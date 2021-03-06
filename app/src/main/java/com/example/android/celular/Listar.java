package com.example.android.celular;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class Listar extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar);
        tabla = (TableLayout)findViewById(R.id.tabla);
        celular=Datos.obtener();

        for (int i = 0; i <celular.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(celular.get(i).getCelular());
            c3.setText(celular.get(i).getRam());
            c4.setText(celular.get(i).getColor());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);


        }

    }
}
