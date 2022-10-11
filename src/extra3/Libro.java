package extra3;
public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumEjemplares() {
        return numEjemplares;
    }
    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }
    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

}
