package com.example.android.celular;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class Datos {
    private static ArrayList<Listar> celular= new ArrayList<>();

    public static void guardar(Listar c){
        celular.add(c);
    }

    public static ArrayList<Listar> obtener(){
        return celular;
    }
}
