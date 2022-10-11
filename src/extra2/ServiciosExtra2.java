package extra2;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosExtra2 {
    private final Scanner leer = new Scanner(System.in);
    ArrayList<CantanteFamoso> cantantesFamosos = new ArrayList<>();
    public void crearCantanteFamoso(){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del cantante: ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el disco con mas ventas");
            String discoConMasVentas = leer.nextLine();
            CantanteFamoso cantanteFamoso = new CantanteFamoso(nombre, discoConMasVentas);
            cantantesFamosos.add(cantanteFamoso);
            while (true) {
                System.out.println("Desea ingresar otro cantante? (si/no)");
                respuesta = leer.nextLine();
                if (respuesta.equals("si") || respuesta.equals("no")) {
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida");
                }
            }
        } while (!respuesta.equals("no"));
    }
    public void agregarUnCantante(){
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el disco con mas ventas de " + nombre + ": ");
        String discoConMasVentas = leer.nextLine();
        CantanteFamoso cantanteFamoso = new CantanteFamoso(nombre, discoConMasVentas);
        cantantesFamosos.add(cantanteFamoso);
    }
    public void mostrarCantantes(){
        for (CantanteFamoso cantanteFamoso : cantantesFamosos){
            System.out.println("Cantante: " + cantanteFamoso.getNombre() +
                    " ***** Disco con mas ventas: " + cantanteFamoso.getDiscoConMasVentas());
        }
    }
    public void mostrarSoloCantantes (){
        for (CantanteFamoso cantanteFamoso : cantantesFamosos){
            System.out.println("Cantante: " + cantanteFamoso.getNombre());
        }
    }
    public void eliminarCantante(){
        System.out.println("Cantantes disponibles para eliminar: ");
        mostrarSoloCantantes();
        System.out.println("Ingrese el nombre del cantante a eliminar: ");
        String nombre = leer.nextLine();
        for (CantanteFamoso cantanteFamoso : cantantesFamosos){
            if (cantanteFamoso.getNombre().equals(nombre)){
                cantantesFamosos.remove(cantanteFamoso);
                break;
            }
        }
    }
    public void Menu(){
        int opcion;
        do {
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Eliminar un cantante");
            System.out.println("3. Mostrar Cantantes Actuales");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1 -> agregarUnCantante();
                case 2 -> eliminarCantante();
                case 3 -> mostrarCantantes();
                case 4 -> System.out.println("Saliendo del programa");
            }
        } while (opcion != 4);
    }

}
