
package modelo;

public class Curso extends Persona {
     
    private String paralelo;
    private int numAlumnos;

    public Curso(String paralelo, int numAlumnos, String nombre, String cedula, String fechaNac) {
        super(nombre, cedula, fechaNac);
        this.paralelo = paralelo;
        this.numAlumnos = numAlumnos;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "paralelo=" + paralelo + ", numAlumnos=" + numAlumnos + '}';
    }
    
    
    
}
