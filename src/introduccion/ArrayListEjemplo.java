package introduccion;
import java.util.ArrayList;

public class ArrayListEjemplo {
    public static void main(String[] args) {

        // asi lo haciamos antes, creamos un array de tipo String, definimos
        // la dimsension del array, llenamos de datos con el for, e imprimimos por
        // pantalla con un for tambien pero con nueva forma -- NOVEDAD

        String [] nombreArray = new String[5];

            for (int i = 0 ; i < nombreArray.length ; i ++){
            nombreArray [i] = "elemento: " + (i+1);
            }
            for (String var : nombreArray){
            System.out.println(var);
            }

        // Collections, arraylist...dar bola ya que esto es nuevo papito


        // Declaracion base de un arraylist, en este caso con dimension cero.

        ArrayList<String> nombreArrayList = new ArrayList<>();


        // Agregamos elementos con el metodo .add

            nombreArrayList.add("Nicolas");
            nombreArrayList.add("Nicolas");
            nombreArrayList.add("Nicolas");

        System.out.println(nombreArrayList.size());
        System.out.println(nombreArrayList);


        //Podemos remover/eliminar un elemento del arraylist con el metodo .remove

            nombreArrayList.remove("Nicolas");

        System.out.println(nombreArrayList);
        System.out.println(nombreArrayList.size());

    }
}
