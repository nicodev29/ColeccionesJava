package extra4;

public class main {
    public static void main(String[] args) {

        Servicios serviciosPostales = new Servicios();

        serviciosPostales.cargarDatos();
        serviciosPostales.mostrarCodigoCiudad();
        serviciosPostales.CodigoAsociado();
        serviciosPostales.AgregarCiudad();
        serviciosPostales.EliminarCiudad();
        serviciosPostales.mostrarCodigoCiudad();
    }
}
