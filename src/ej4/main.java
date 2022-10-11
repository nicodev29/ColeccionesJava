package ej4;

import ej3.ServiciosAlumno;

public class main {
    public static void main(String[] args) {

        ServiciosPelicula sp = new ServiciosPelicula();

        sp.crearPeliculas();
        sp.mostrarPeliculas();
        sp.mostrarMayorHora(1);
        sp.mayorAmenor();
        sp.menorAmayor();
        sp.ordenarPorTitulo();
        sp.ordernarPorDirector();




    }
}
