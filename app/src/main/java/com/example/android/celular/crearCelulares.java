package com.example.android.celular;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by android on 26/09/2017.
 */

public class crearCelulares extends AppCompatActivity {


    private Spinner combocelular, comboram, combocolor;
    private String[] celular;
    private String[] ram;
    private String[] color;
    private ArrayAdapter adaptercelular;
    private ArrayAdapter adapterram;
    private ArrayAdapter adaptercolor;
    public crearCelulares(String cel, String ra, String col) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celulares);

        combocelular = (Spinner) findViewById(R.id.cmbCelular);
        comboram = (Spinner)findViewById(R.id.cmbRam);
        combocolor = (Spinner)findViewById(R.id.cmbColor);

        celular = this.getResources().getStringArray(R.array.modelos);
        adaptercelular = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,celular);
        combocelular.setAdapter(adaptercelular);

        ram = this.getResources().getStringArray(R.array.ram);
        adapterram = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ram);
        comboram.setAdapter(adapterram);

        color = this.getResources().getStringArray(R.array.color);
        adaptercolor = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,color);
        combocolor.setAdapter(adaptercolor);


    }

    public void guardar(View view) {
        String cel, ra, col;

        cel = combocelular.getSelectedItem().toString();
        ra = comboram.getSelectedItem().toString();
        col = comboram.getSelectedItem().toString();

        crearCelulares c = new crearCelulares(cel,ra,col);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
    }


}
