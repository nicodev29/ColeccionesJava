package ej5;
public class Pais {
    private final String nombrePais;
    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public String getNombrePais() {
        return nombrePais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais pais)) return false;

        return nombrePais.equals(pais.nombrePais);
    }

    @Override
    public int hashCode() {
        return nombrePais.hashCode();
    }

    public int compareTo(Pais pais){
        return this.nombrePais.compareTo(pais.nombrePais);
    }
}



