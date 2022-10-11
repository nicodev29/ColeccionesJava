package introduccion;

public class MascotApp {
    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();
        sm.fabricaMascotaTeclado(2);
        sm.mostrarMascotas();

    }
}
