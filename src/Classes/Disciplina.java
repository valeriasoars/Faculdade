package Classes;
import Classes.Abstrata.ItemAcademico;

import java.util.Map;


public class Disciplina extends ItemAcademico {

    private int cargaHoraria;
    private Professor professorResponsavel;
    private double nota;

    public Disciplina(String nome, String codigo, int cargaHoraria, Professor professorResponsavel) {
        super(nome, codigo);
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void apresentar() {
        System.out.println("Disciplina: " + getNome());
        System.out.println(("Codigo: " + getCodigo()));
        System.out.println(("Carga horaria: " + getCargaHoraria()));
        System.out.println("Professor responsavel: " + professorResponsavel.getNome());
    }
}