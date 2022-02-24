/*
1) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 
2) Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
*/
package guia8ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Guia8Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> listaRazas = new ArrayList<>();
        String raza;
        byte opcion;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1) Ingreso una raza de perro");
            System.out.println("2) Mostrar lista de las razas ingresadas");
            System.out.println("3) Eliminar una raza ingresada");
            System.out.println("4) Salir ");
            opcion = leer.nextByte();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese una raza de perro");
                    raza = leer.next();
                    listaRazas.add(raza);
                    break;

                case 2:
                    for (String raza1 : listaRazas) {
                        System.out.println(raza1);
                    }
                    break;
                case 3:

                    boolean band = false;
                    System.out.println("Ingrese el nombre de la raza que desea eliminar ");
                    raza = leer.next();
                    Iterator<String> iterator = listaRazas.iterator();
                    while (iterator.hasNext()) {
                        String perro = iterator.next();
                        if (raza.equals(perro)) {
                            iterator.remove();
                            band = true;
                        }
                    }
                    if (band) {
                        System.out.println("La raza ingresada fue removida con exito de la lista ");
                    } else {
                        System.out.println("La raza ingresada no fue encontrada en la lista ");
                    }

                    break;
                case 4:
                    System.out.println("Salir");

            }

        } while (opcion != 4);

    }

}
