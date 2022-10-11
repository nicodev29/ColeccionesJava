package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiciosAlumno {

    private final Scanner sc = new Scanner(System.in);
    private List <Alumno> alumnos = new ArrayList<>();

    public void crearAlumnos(){
        String nombre;
        Integer [] notas = new Integer[3];
        int nota;
        Alumno alumno;
        String respuesta;

        do{
            System.out.println("Ingresa el nombre del alumno");
            nombre = sc.nextLine();
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingresa la nota " + (i+1));
                nota = sc.nextInt();
                notas[i] = nota;
            }
            alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            sc.nextLine();
            System.out.println("¿Quieres añadir otro alumno? (si/no)");
            respuesta = sc.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));
    }

    public void notaFinal(){
        String nombre;
        boolean encontrado = false;
        System.out.println("Introduce el nombre del alumno para calcular su nota final");
        nombre = sc.nextLine();
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("La nota final del alumno " + nombre + " es: " + alumno.calcularNotaFinal());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("El alumno " + nombre + " no está en la lista");
        }
    }

}
