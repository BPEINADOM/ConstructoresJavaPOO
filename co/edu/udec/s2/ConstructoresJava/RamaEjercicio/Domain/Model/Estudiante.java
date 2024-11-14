package RamaEjercicio.Domain.Model;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor predeterminado
    public Estudiante() {
        this.nombre = "Jose Antonio";
        this.edad = 17;
        this.curso = "Literatura";
    }

    // Constructor parametrizado
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Desconocido";
    }

    // Constructor con todos los parametros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    // Metodo
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años" + ", Curso: " + curso;
    }
}


