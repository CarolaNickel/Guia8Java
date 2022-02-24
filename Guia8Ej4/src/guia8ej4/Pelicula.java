package guia8ej4;

import java.util.ArrayList;

public class Pelicula {

    private String nombrePelicula;
    private String nombreDirector;
    private double duracionPelicula;
    //private ArrayList<Integer> listaDuracionPelicula;
    

    public void Pelicula() {
    }

    public void Pelicula (String nombrePelicula, String nombreDirector, double duracionPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.nombreDirector = nombreDirector;
        this.duracionPelicula = duracionPelicula;
        //this.listaDuracionPelicula=listaDuracionPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

   // public ArrayList<Integer> getListaDuracionPelicula() {
       // return listaDuracionPelicula;
    //}

    //public void setListaDuracionPelicula(ArrayList<Integer> listaDuracionPelicula) {
        //this.listaDuracionPelicula = listaDuracionPelicula;
   // }
 
    
}
