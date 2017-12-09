
package modelo;

public class Docente extends Persona {
     private String titulo;

    public Docente(String titulo, String nombre, String cedula, String fechaNac) {
        super(nombre, cedula, fechaNac);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Docente{" + "titulo=" + titulo + '}';
    }
     
     
}
