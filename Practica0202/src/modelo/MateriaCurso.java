
package modelo;

public class MateriaCurso {
    private Curso cursoA;
    private Materia materiaA;
    private String hora;

    public MateriaCurso(Curso cursoA, Materia materiaA, String hora) {
        this.cursoA = cursoA;
        this.materiaA = materiaA;
        this.hora = hora;
    }

    public Curso getCursoA() {
        return cursoA;
    }

    public void setCursoA(Curso cursoA) {
        this.cursoA = cursoA;
    }

    public Materia getMateriaA() {
        return materiaA;
    }

    public void setMateriaA(Materia materiaA) {
        this.materiaA = materiaA;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "MaterCurso{" + "cursoA=" + cursoA + ", materiaA=" + materiaA + ", hora=" + hora + '}';
    }
}
