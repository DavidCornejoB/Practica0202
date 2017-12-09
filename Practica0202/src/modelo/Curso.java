
package modelo;

public class Curso {
     
    private String paralelo;
    private int numAlumnos;
    private Materia materia;

    public Curso(String paralelo, int numAlumnos, Materia materia) {
        this.paralelo = paralelo;
        this.numAlumnos = numAlumnos;
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
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
        return "Curso{" + "paralelo=" + paralelo + ", numAlumnos=" + numAlumnos + ", materia=" + materia + '}';
    }

    
    
    
}
