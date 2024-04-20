package Classes;

import Classes.Interface.CalcularMediaAlunos;

import java.util.ArrayList;
import java.util.List;

public class AlunoGraduacao extends Aluno implements CalcularMediaAlunos{

    private List<Disciplina> disciplinasCursadas;

    public AlunoGraduacao(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco, matricula, curso);
        this.disciplinasCursadas = new ArrayList<>();
    }

    public void disciplinasCursadas(Disciplina disciplina){
        disciplinasCursadas.add(disciplina);
    }

    public void adicionarNotaDisciplina(Disciplina disciplina, double nota) {
            disciplina.setNota(nota);
    }

    @Override
    public double calcularmedia() {
        double somaNotas = 0;
        int numDisciplinas = disciplinasCursadas.size();

        for (Disciplina disciplina : disciplinasCursadas) {
            somaNotas += disciplina.getNota();
        }

        return somaNotas / numDisciplinas;
    }


    @Override
    public void apresentar() {
        System.out.println("Aluno Graduação");
        super.apresentar();
        System.out.println("Media: " + calcularmedia());
    }

}
