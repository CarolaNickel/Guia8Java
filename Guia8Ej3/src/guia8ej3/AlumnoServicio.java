package guia8ej3;

import java.util.ArrayList;

import java.util.Scanner;

public class AlumnoServicio {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;
    byte opc;

    public void crearAlumno(String nombre, ArrayList<Integer> listaNota) {
        System.out.println("Ingreso de datos al sistema");
        System.out.println("¿Desea agregar los datos del alumno? ( SI=1 - NO=2) ");
        opc = leer.nextByte();
        do {

            Alumno alumno = new Alumno();
            alumno.setNombre(nombre);

            for (int i = 0; i <= 2; i++) {
                System.out.println("Ingrese nota " + (i + 1));
                alumno.setNota(listaNota);
            }
            alumnos.add(alumno);
            
        } while (opc == 1);
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que desea buscar en la lista ");
        String busqNombre = leer.next();

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(busqNombre)) {
                alumno.notaFinal();
            }
        }

    }

}
