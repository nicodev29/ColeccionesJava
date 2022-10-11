package extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int numero;
        do {
            System.out.println("Ingrese un numero: ");
            numero = leer.nextInt();
            if (numero != -99){
                numeros.add(numero);
            }
        } while (numero != -99);
        System.out.println("Ingresaste el numero -99...");
        System.out.println();
        System.out.println("El contenido del ArrayList es: " + numeros);
        System.out.println("La cantidad de elementos almacenados son: " + numeros.size());
        int suma = 0;
        for (Integer integer : numeros) {
            suma = suma + integer;
        }
        System.out.println("La suma de todos los elementos es: " + suma);
        int media = suma / numeros.size();
        System.out.println("La media es: " + media);


    }
}
