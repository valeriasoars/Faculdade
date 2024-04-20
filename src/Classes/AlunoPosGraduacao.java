package Classes;


import Classes.Interface.CalcularMediaAlunos;

import java.util.ArrayList;
import java.util.List;

public class AlunoPosGraduacao extends Aluno implements CalcularMediaAlunos {


    public AlunoPosGraduacao(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco, matricula, curso);
    }

    @Override
    public void disciplinasCursadas(Disciplina disciplina) {
        super.disciplinasCursadas(disciplina);
    }

    @Override
    public void adicionarNotaDisciplina(Disciplina disciplina, double nota) {
        super.adicionarNotaDisciplina(disciplina, nota);
    }

    @Override
    public double calcularmedia() {
        double somaNotas = 0;
        int numDisciplinas = getDisciplinasCursadas().size();

        for (Disciplina disciplina : getDisciplinasCursadas()) {
            somaNotas += disciplina.getNota();
        }

        return somaNotas / numDisciplinas;
    }

    @Override
    public void apresentar() {
        System.out.println("Aluno Pós Graduação");
        super.apresentar();
        System.out.println("Media: " + calcularmedia());

    }
}
