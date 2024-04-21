package Entitiy;
import Entitiy.Abstract.AbstractPessoa;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends AbstractPessoa {

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

    public void adicionarDisciplinasCursadas(Disciplina disciplina){
        disciplinasCursadas.add(disciplina);
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome do curso: " + curso.getNome());
    }

}
