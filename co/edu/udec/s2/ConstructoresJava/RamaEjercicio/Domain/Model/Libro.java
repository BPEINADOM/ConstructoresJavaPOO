package RamaEjercicio.Domain.Model;

public class Libro {
    private String titulo;
    private String autor;
    private int numerodepaginas;

    // Constructor por defecto
    public Libro(){
        this.titulo = "Libro desconocido";
        this.autor = "Anonimo";
        this.numerodepaginas = 10;
    }

    // Constructor con parametros
    public Libro(String titulo, String autor, int numerodepaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
    }

    // Metodo
    public void mostrarInformacionLibro() {
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Numero de paginas: " + numerodepaginas + " paginas");
    }

    // Metodo
    @Override
    public String toString() {
        return "Titulo del libro: " + titulo + ", Autor del libro: " + autor + ", Numero de paginas: " + numerodepaginas + " paginas";
    }

    

}
