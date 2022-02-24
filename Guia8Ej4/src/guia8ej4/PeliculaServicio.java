/*En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia8ej4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class PeliculaServicio {

    ArrayList<Pelicula> listaPeliculas = new ArrayList();

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    byte seleccion;

    //opcion 1. Registro de pelicula
    public void registroPelicula() {

        do {

            System.out.println("Ingreso de un Titulo nuevo");
            System.out.println(" ");
            System.out.print("Ingrese el nombre de la pelicula: ");
            String nombrePelicula = leer.next();
            System.out.print("Ingrese el director de la pelicula: ");
            String nombreDirector = leer.next();
            System.out.print("Ingrese la duracion de la pelicula: ");
            double duracionPelicula = leer.nextDouble();
            Pelicula pelicula = new Pelicula();

            pelicula.setNombrePelicula(nombrePelicula);
            pelicula.setNombreDirector(nombreDirector);
            pelicula.setDuracionPelicula(duracionPelicula);

            listaPeliculas.add(pelicula);

            System.out.println("Desea añadir otra pelicula? (SI=1 - NO=2)");
            seleccion = leer.nextByte();

        } while (seleccion == 1);

    }

    public void mostrarListaPeliculas() {
        System.out.println(listaPeliculas);
    }

    public void mostrarPelisMayoresaHora() {

        //System.out.println("Lista de peliculas cuya duracion es mayor a 1hr");
        //for (int i=0; i <= listaPeliculas.size(); i++);{
        //double pelicula = listaPeliculas.get(i);
        //System.out.println(pelicula);
        System.out.println(listaPeliculas.get(pelicula.setduracioPelicula<=1.0));
    }

    public void mostrarListaMayoraMenor() {
        //System.out.println(Collections.sort(listaPeliculas));
        Collections.sort(listaPeliculas);
        
        listaPeliculas.sort(Comparator.naturalOrder()); 
        System.out.println("After Sorting: "+ listaPeliculas);
    }

    public void mostrarListaMenoraMayor() {

    }

    public void mostrarListaAlfabeticamentePorTitulo() {

    }

    public void mostrarListaAlfabeticamentePorDirector() {

    }

}
