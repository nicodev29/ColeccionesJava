package ej5;
import java.util.*;
public class ServiciosPais {
    private final Scanner leer = new Scanner (System.in);

    //usamos un hashset para que no se repitan los paises
    private final HashSet<Pais> paises = new HashSet<>();

    //creamos paises en bucle hasta que el usuario decida
    public void crearPaises(){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del pais: ");
            String nombre = leer.nextLine();
            paises.add(new Pais(nombre));
            while (true) {
                System.out.println("Desea ingresar otro pais? (si/no)");
                respuesta = leer.nextLine();
                if (respuesta.equals("si") || respuesta.equals("no")) {
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida");
                }
            }
        } while (!respuesta.equals("no"));
    }

    //mostramos paises con un for each
    public void mostrarPaises(){
        System.out.println("Los paises ingresados fueron: ");
        for (Pais pais : paises){
            System.out.println(pais.getNombrePais());
        }
    }

    //ordenamos paises por nombre con un comparator y los mostramos
    public void ordenarPaises(){
        List<Pais> listaPaises = new ArrayList<>(paises);
        listaPaises.sort(new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o1.getNombrePais().compareTo(o2.getNombrePais());
            }
        });
        System.out.println("Los paises ordenados por nombre son: ");
        for (Pais pais : listaPaises){
            System.out.println(pais.getNombrePais());
        }
    }

    //ordenamos paises de forma inversa al metodo anterior y mostramos.
    //lo unico que cambia es el return del comparator, devolvemos o2 en vez de o1.
    public void ordenarPaises2(){
        List<Pais> listaPaises2 = new ArrayList<>(paises);
        listaPaises2.sort(new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o2.getNombrePais().compareTo(o1.getNombrePais());
            }
        });
        System.out.println("Los paises ordenados por nombre de forma descendente son: ");
        for (Pais pais : listaPaises2){
            System.out.println(pais.getNombrePais());
        }
    }

    // ingresar un pais y recorrer el hashset para ver si existe con un iterator, si existe lo borra y lo muestra sino existe informa
    public void borrarPais(){
        System.out.println("Ingrese el pais que desea eliminar: ");
        String paisEliminar = leer.nextLine();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()){
            if (it.next().getNombrePais().equals(paisEliminar)){
                it.remove();
                System.out.println("El pais " + paisEliminar + " fue eliminado");
                return;
            }
        }
        System.out.println("El pais " + paisEliminar + " no existe");

    }
}