

package controlador;

import java.util.List;
import modelo.Curso;
import modelo.Docente;
import modelo.Materia;

public class GestionDato {
    private List<Docente> docenteList;
    private List<Materia> materiaList;
    private List<Curso> cursoList;

    public GestionDato(List<Docente> docenteList, List<Materia> materiaList, List<Curso> cursoList) {
        this.docenteList = docenteList;
        this.materiaList = materiaList;
        this.cursoList = cursoList;
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(List<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
    
    public boolean addDocente(Docente d){
        return this.addDocente(d);
    }
    
    public boolean addMateria(Materia m){
        return this.addMateria(m);
    }
    
    public boolean addCurso(Curso c){
        return this.addCurso(c);
    }
    
    
}
