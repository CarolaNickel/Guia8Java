/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
 */
package guia8ej3;

import java.util.Locale;
import java.util.Scanner;

public class Guia8Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Alumno alumno = new Alumno();
        AlumnoServicio alumnoservicio = new alumnoservicio();

        byte opc;

        do {
            System.out.println("Menu");
            System.out.println("1) Ingreso del nombre y notas del alumno ");
            System.out.println("2) busqueda del alumno en el sistema. Retornara el nombre completo y el promedio de sus notas");
            System.out.println("3) Cerrar sesion");

            opc = leer.nextByte();

            switch (opc) {
                case 1:
                    alumnoservicio.crearAlumno(leer.next(), leer.nextInt());
                    break;
                case 2:
                    alumnoservicio.notaFinal();
                    break;
                case 3:
                    System.out.println("Salir");

            }

        } while (opc != 3);

    }

}
