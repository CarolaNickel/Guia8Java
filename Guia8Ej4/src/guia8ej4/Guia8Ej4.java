/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
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
• Ordenar las películas por director, alfabéticamente y mostrarlo en spantalla.
 */
package guia8ej4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Guia8Ej4 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        PeliculaServicio peliculaservicio = new PeliculaServicio();
        
        byte opc;

        do {
            System.out.println("Menu");
            System.out.println("1) Ingreso de un Titulo nuevo"); 
            System.out.println("2) Mostrar lista de peliculas ");
            System.out.println("3) Mostrar peliculas que posean una duracion mayor a 1hr");
            System.out.println("4) Mostrar peliculas en orden de acuerdo a su duracion (Mayor-Menor)");
            System.out.println("5) Mostrar peliculas en orden de acuerdo a su duracion (Menor-Mayor)");
            System.out.println("6) Mostrar peliculas ordenadas alfabeticamente por titulo");
            System.out.println("7) Mostrar peliculas ordenadas alfabeticamente por director");
            System.out.println("8) Salir");

            opc = leer.nextByte();

            switch (opc) {
                case 1:
                    peliculaservicio.registroPelicula();
                    break;
                case 2:
                    peliculaservicio.mostrarListaPeliculas();
                    break;
                case 3:
                    peliculaservicio.mostrarPelisMayoresaHora();
                    break;
                case 4:
                    peliculaservicio.mostrarListaMayoraMenor();
                    break;
                case 5:
                    peliculaservicio.mostrarListaMenoraMayor();
                    break;
                case 6:
                    peliculaservicio.mostrarListaAlfabeticamentePorTitulo();
                    break;
                case 7:
                    peliculaservicio.mostrarListaAlfabeticamentePorTitulo();
                    break;
                case 8:
                    System.out.println("Salir");

            }

        } while (opc != 8);

    }

}
