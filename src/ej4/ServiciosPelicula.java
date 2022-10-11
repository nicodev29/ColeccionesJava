package ej4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServiciosPelicula {

    private final Scanner sc = new Scanner(System.in);
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void crearPeliculas() {
        String respuesta;

        do {
            System.out.println("Ingrese el nombre de la pelicula: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el director: ");
            String director = sc.nextLine();
            System.out.println("Ingrese la duracion: ");
            Float duracion = (sc.nextFloat());
            peliculas.add(new Pelicula(nombre, director, duracion));

            while (true) {
                System.out.println("Desea ingresar otra pelicula? (si/no)");
                sc.nextLine();
                respuesta = sc.nextLine();
                if (respuesta.equals("si") || respuesta.equals("no")) {
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida");
                }
            }
        } while (!respuesta.equals("no"));

    }

    public void mostrarPeliculas (){
        for (Pelicula peliculasMostrar : peliculas){
            System.out.println(peliculasMostrar);
        }
    }

    public void mostrarMayorHora(int duracion){
        System.out.println("\nPeliculas con duracion mayor a " + duracion + " horas:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > duracion) {
                System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
            }
        }
    }

    public void mayorAmenor(){
        peliculas.sort((p1, p2) -> p2.getDuracion().compareTo(p1.getDuracion()));
        System.out.println("\nPeliculas ordenadas de mayor a menor:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
        }
    }

    //ordenar peliculas con comparator y mostrarlas por duracion
    public void menorAmayor(){
        peliculas.sort(Comparator.comparing(Pelicula::getDuracion));
        System.out.println("\nPeliculas ordenadas de menor a mayor:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
        }
    }

    public void ordenarPorTitulo (){
        System.out.println("Peliculas ordenadas por titulo: ");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        System.out.println("Peliculas ordenadas por Titulo: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
        }
    }

    public void ordernarPorDirector (){
        System.out.println("Peliculas ordenadas por Director: ");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        System.out.println("Peliculas ordenadas por Director: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
        }
    }
}