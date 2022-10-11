package introduccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1y2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList<>();
        String respuesta;
        do {
            System.out.println("Ingresa una raza de perros: ");
            String raza = sc.nextLine();
            razasPerros.add(raza);

            while (true) {

                System.out.println("¿Quieres añadir otra raza? (si/no)");
                respuesta = sc.nextLine();
                if (respuesta.equals("si") || respuesta.equals("no")) {
                    break;
                }
                System.out.println("Respuesta no válida");
            }
        } while (!respuesta.equals("no"));

        System.out.println("Las razas de perros son:");
        System.out.println();
        for (String raza : razasPerros) {
            System.out.println(raza);
        }


        Iterator <String> iterador = razasPerros.iterator();
        System.out.println("Ingresa una raza de perro para eliminar: ");
        String raza = sc.nextLine();
        sc.close();

        Boolean encontrado = false;

        while (iterador.hasNext()){
            String razaEliminada = iterador.next();
            if (razaEliminada.equals(raza)){
                iterador.remove();
                System.out.println("La raza >> " +  razaEliminada + " << se ha eliminado");
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("La raza " + raza + " no se ha encontrado");
        }

        System.out.println("Las razas de perros ahora son:");
        Collections.sort(razasPerros);
      for (String razasOrdenadas : razasPerros){
          System.out.println(razasOrdenadas);
      }
      sc.close();

    }
}


