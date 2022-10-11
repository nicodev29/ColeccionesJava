package ej3;

public class Alumno {
    private String nombre;
    private Integer [] notas;

    public Alumno(String nombre, Integer[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    public Alumno (){
    }

    public String calcularNotaFinal() {

        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        int media = suma / notas.length;
        if (media >= 5) {
            return media + ", alumno aprobado.";
        } else {
            return nombre + " No aprobo, su nota es: " + media + ".";
        }
    }
}
