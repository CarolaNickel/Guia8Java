package guia8ej3;

import java.util.ArrayList;
import java.util.Iterator;

public class Alumno {

    //Atributos    
    private String nombre;
    private ArrayList<Integer> listaNota;

    //Rep vacio
    public void Alumno() {
    }

    //Rep parametrizado
    public void Alumno(String nombre, ArrayList<Integer> listaNota) {
        this.nombre = nombre;
        this.listaNota = listaNota;
    }

    //SET - GET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getlistaNota() {
        return listaNota;
    }

    public void setNota(ArrayList<Integer> listaNota) {
        this.listaNota = listaNota;
    }

    public void notaFinal() {
        double acumulador = 0;
        Iterator<Integer> iterator = listaNota.iterator();

        while (iterator.hasNext()) {
            Integer nota1 = iterator.next();
            acumulador += nota1;

        }
        System.out.println("la nota final es: " + acumulador /3);
    }
}
