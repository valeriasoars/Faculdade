package Entitiy;
import Entitiy.Interface.ICalcularMediaAlunos;

public class AlunoGraduacao extends Aluno implements ICalcularMediaAlunos {

    public AlunoGraduacao(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco, matricula, curso);
    }

    @Override
    public void adicionarDisciplinasCursadas(Disciplina disciplina) {
        super.adicionarDisciplinasCursadas(disciplina);
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
        System.out.println("Aluno Graduação");
        super.apresentar();
        System.out.println("Media: " + calcularmedia());
        System.out.println("-----");
    }

}
