package Classes;

import Classes.Abstrata.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno extends Pessoa {

    private String matricula;
    private Curso curso;
    private List<Disciplina> disciplinasCursadas;

    public Aluno(String nome, String endereco, String matricula, Curso curso)
    {
        super(nome, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasCursadas = new ArrayList<>();
    }

    public List<Disciplina> getDisciplinasCursadas(){
        return disciplinasCursadas;

    }

    public void adicionarNotaDisciplina(Disciplina disciplina, double nota) {
        disciplina.setNota(nota);
    }

    public void  setDisciplinasCursadas(List<Disciplina> disciplinasCursadas){
        this.disciplinasCursadas = disciplinasCursadas ;
    }

    public void disciplinasCursadas(Disciplina disciplina){
        disciplinasCursadas.add(disciplina);
    }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso(){
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }




    @Override
    public void apresentar() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome do curso: " + curso.getNome());

    }
}
