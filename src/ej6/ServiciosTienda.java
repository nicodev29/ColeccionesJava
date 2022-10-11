package ej6;
import java.util.HashMap;
import java.util.Scanner;

public class ServiciosTienda {
    private final Scanner leer = new Scanner (System.in);
    private HashMap<String,Float> productos = new HashMap<String, Float>();

    public void menu (){

        System.out.println("Bienvenido a la tienda");
        System.out.println("Que operacion quieres realizar?");
        System.out.println("");

        int opcion;

        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Producto");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 5);
    }

    private void agregarProducto() {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio de: " + nombre);
        float precio = leer.nextFloat();
        leer.nextLine();
        productos.put(nombre,precio);
    }

    private void modificarPrecio () {
        System.out.println("Que producto quieres modificar?");
        mostrarProductos();
        String nombre = leer.nextLine();
        if (productos.containsKey(nombre)){
            System.out.println("Ingrese el nuevo precio de: " + nombre);
            float precio = leer.nextFloat();
            leer.nextLine();
            productos.put(nombre,precio);
            System.out.println("Precio modificado con exito, el nuevo precio es: $" + precio);
        } else {
            System.out.println("El producto ingresado no existe");
        }
    }

    private void eliminarProducto() {
        System.out.println("Que producto quieres eliminar?");
        System.out.println("Productos disponibles para borrar: ");
        mostrarSoloProductos();
        String nombre = leer.nextLine();
        if (productos.containsKey(nombre)){
            productos.remove(nombre);
            System.out.println("Producto eliminado con exito, eliminaste: " + nombre);
        } else {
            System.out.println("El producto ingresado no existe");
        }
    }

    private void mostrarSoloProductos (){
        for (String producto : productos.keySet()) {
            System.out.println(producto);
        }
    }

    private void mostrarProductos() {
        for (String producto : productos.keySet()) {
            System.out.println("Los productos cargados en la tienda son: ");
            System.out.println("Producto: " + producto + " ---- Precio: $" + productos.get(producto));
            }
            if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda");
            }
        }
    }
