package introduccion;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioMascota {
    private Scanner leer;
    private ArrayList<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in);
        this.mascotas = new ArrayList<>();

    }

    public Mascota crearMascota() {

        System.out.println("Introduce el nombre de tu mascota: ");
        String nombre = leer.nextLine();

        Mascota m = new Mascota(nombre);

        mascotas.add(m);
        return m;

    }

    public void mostrarMascotas(){

        System.out.println("Las mascotas que nombraste son: ");

        for (Mascota aux : mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());

    }

    // pasamos por parametro la cantidad de mascotas a crear
    public void fabricaMascotas (int cantidad){

        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Mascota"));
        }
    }


    // crea mascotas pero via teclado le pasamos la cantidad
    public void fabricaMascotaTeclado (int cantidad){

        for (int i = 0; i < cantidad; i++) {
            Mascota creadas = crearMascota();
            System.out.println(creadas.toString());
        }
    }
}

