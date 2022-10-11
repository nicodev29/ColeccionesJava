package extra4;
import java.util.HashMap;
import java.util.Scanner;
public class Servicios {
    private final Scanner leer = new Scanner (System.in);
    HashMap <String, Float> serviciosPostales = new HashMap <String, Float>();
        public void cargarDatos (){

            for (int i = 0; i < 10; i++) {
                System.out.println("Ingresa el nombre de la ciudad: ");
                String ciudad = leer.nextLine();
                System.out.println("Ingresa el codigo postal: ");
                float codigoPostal = leer.nextFloat();
                leer.nextLine();
                serviciosPostales.put(ciudad, codigoPostal);
            }
        }
        public void mostrarCodigoCiudad (){
            for (String ciudad_codigo: serviciosPostales.keySet()) {
                System.out.println("Ciudad: " + ciudad_codigo + " ----- " + "Codigo Postal: " +  serviciosPostales.get(ciudad_codigo));
            }
        }
        public void CodigoAsociado (){
            System.out.println("Ingrese el codigo postal para encontrar coincidencia: ");
            float codigoPostal = leer.nextFloat();
            leer.nextLine();
            for (String ciudad_codigo: serviciosPostales.keySet()) {
                if (serviciosPostales.get(ciudad_codigo) == codigoPostal){
                    System.out.println("La ciudad asociada al codigo postal ingresado es: " + ciudad_codigo);
                }
            }
        }
        public void AgregarCiudad (){
            System.out.println("Ingrese el nombre de la ciudad a agregar: ");
            String ciudad = leer.nextLine();
            System.out.println("Ingrese el codigo postal de la ciudad a agregar: ");
            Float codigoPostal = leer.nextFloat();
            leer.nextLine();
            serviciosPostales.put(ciudad, codigoPostal);
            System.out.println("Se agrego la ciudad: " + ciudad + " con el codigo postal: " + codigoPostal);
        }
        public void mostrarSoloCiudad (){
            for (String ciudad_codigo: serviciosPostales.keySet()) {
                System.out.println("Ciudad: " + ciudad_codigo);
            }
        }
        public void EliminarCiudad () {
            for (int i = 0; i < 3; i++) {
                System.out.println("Ciudades cargadas: ");
                mostrarSoloCiudad();
                System.out.println();
                System.out.println("Ingrese el nombre de las ciudades que desea eliminar: ");
                String ciudad = leer.nextLine();
                if (serviciosPostales.containsKey(ciudad)){
                    serviciosPostales.remove(ciudad);
                    System.out.println("Se elimino la ciudad: " + ciudad);
                    System.out.println();
                } else {
                    System.out.println("La ciudad ingresada no existe");
                }
                System.out.println("Las ciudades que quedaron son: ");
                System.out.println();
            }
        }
}

