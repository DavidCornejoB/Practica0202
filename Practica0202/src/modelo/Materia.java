
package modelo;

public class Materia {
    
    private String nombre;
    private Docente docente;

    public Materia(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
    }
    
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", docente=" + docente + '}';
    }
    
}
