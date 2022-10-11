package extra3;
import java.util.HashSet;
import java.util.Scanner;
public class ServiciosLibro {
    private final Scanner leer = new Scanner(System.in);
    HashSet<Libro> libros = new HashSet<>();
    public void crearLibro() {
        String respuesta;
        do {
            System.out.println("Ingrese el titulo del libro: ");
            String titulo = leer.nextLine();
            System.out.println("Ingrese el autor del libro: ");
            String autor = leer.nextLine();
            System.out.println("Ingrese el numero de ejemplares del libro: ");
            int numEjemplares = leer.nextInt();
            System.out.println("Ingrese el numero de ejemplares prestados del libro: ");
            int numEjemplaresPrestados = leer.nextInt();
            Libro libro = new Libro(titulo, autor, numEjemplares, numEjemplaresPrestados);
            libros.add(libro);
            while (true) {
                System.out.println("Desea ingresar otro Libro? (si/no)");
                leer.nextLine();
                respuesta = leer.nextLine();
                if (respuesta.equals("si") || respuesta.equals("no")) {
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida");
                }
            }
        } while (!respuesta.equals("no"));
    }
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println();
            System.out.println("Titulo: " + libro.getTitulo());
        }
    }
    public void prestarLibro() {
        System.out.println("Libros disponibles para prestar: ");
        mostrarLibros();
        System.out.println();
        System.out.println("Ingrese el titulo del libro a prestar: ");
        String titulo = leer.nextLine();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.getNumEjemplaresPrestados() < libro.getNumEjemplares()) {
                    libro.setNumEjemplaresPrestados(libro.getNumEjemplaresPrestados() + 1);
                    System.out.println();
                    System.out.println("El libro " + libro.getTitulo() + " fue prestado");
                    System.out.println();
                    System.out.println("Quedan " + (libro.getNumEjemplares() - libro.getNumEjemplaresPrestados()) + " ejemplar/es disponible/s");
                    System.out.println();
                    System.out.println(libro.getNumEjemplaresPrestados() + " ejemplares fueron prestados");
                } else {
                    System.out.println("No hay ejemplares disponibles para prestar");
                }
            }
        }
    }
    public void devolverLibro (){
        System.out.println("Libros disponibles para devolver: ");
        mostrarLibros();
        System.out.println();
        System.out.println("Ingrese el titulo del libro a devolver: ");
        String titulo = leer.nextLine();
        for (Libro libro : libros){
            if (libro.getTitulo().equals(titulo)){
                if (libro.getNumEjemplaresPrestados() > 0){
                    libro.setNumEjemplaresPrestados(libro.getNumEjemplaresPrestados() - 1);
                    System.out.println();
                    System.out.println("El libro " + libro.getTitulo() + " fue devuelto");
                    System.out.println();
                    System.out.println("Quedan " + (libro.getNumEjemplares() - libro.getNumEjemplaresPrestados()) + " ejemplar/es disponible/s");
                    System.out.println();
                    System.out.println(libro.getNumEjemplaresPrestados() + " ejemplares fueron prestados");
                } else {
                    System.out.println("No hay ejemplares prestados");
                }
            }
        }



    }
    public void mostrarDatosLibro(){
        for (Libro libro : libros)  {
                System.out.println();
                System.out.println("Titulo: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Numero de ejemplares: " + libro.getNumEjemplares());
                System.out.println("Numero de ejemplares prestados: " + libro.getNumEjemplaresPrestados());
            }
        }
}

