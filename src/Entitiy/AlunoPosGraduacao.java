package Entitiy;


import Entitiy.Interface.ICalcularMediaAlunos;

public class AlunoPosGraduacao extends Aluno implements ICalcularMediaAlunos {


    private String cursoSuperior;

    public AlunoPosGraduacao(String nome, String endereco, String matricula, Curso curso, String cursoSuperior) {
        super(nome, endereco, matricula, curso);
        this.cursoSuperior = cursoSuperior;
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
        System.out.println("Aluno Pós Graduação");
        super.apresentar();
        System.out.println("Curso superior: " + cursoSuperior);
        System.out.println("Media: " + calcularmedia());

    }
}
