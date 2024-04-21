import Entitiy.*;
import Entitiy.Abstract.AbstractItemAcademico;
import Entitiy.Abstract.AbstractPessoa;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso("Ciência da Computação", "1010");
        Curso curso2 = new Curso(" Engenharia de Software", "2020");


        Professor professor1 = new Professor("Claudia", "Rua a", "Informática");
        Professor professor2 = new Professor("Luiz", "Rua b", "Informática");
        Professor professor3 = new Professor("Marcia", "Rua c", "Informática");


        Disciplina disciplina1 = new Disciplina("Computação Gráfica", "PR11", 60, professor1);
        Disciplina disciplina2 = new Disciplina("Robótica", "PR22", 40, professor2);
        Disciplina disciplina3 = new Disciplina("Algoritmos e Estruturas de Dados", "PR33", 80, professor3);
        Disciplina disciplina4 = new Disciplina("Programação Orientada a Objetos", "PR44", 80, professor1);
        Disciplina disciplina5 = new Disciplina("Introdução à Engenharia de Software", "PR55", 60,professor2);

        //professor - discplinas ministradas
        professor1.adicionarDisciplina(disciplina1);
        professor1.adicionarDisciplina(disciplina4);
        professor2.adicionarDisciplina(disciplina2);
        professor2.adicionarDisciplina(disciplina5);
        professor3.adicionarDisciplina(disciplina3);

        //disciplina obrigatorias do curso 1
        curso1.adicionarDisciplinaObrigatoria(disciplina3);
        curso1.adicionarDisciplinaObrigatoria(disciplina4);

        //disciplina eletivas do curso 1
        curso1.adicionarDisciplinaEletiva(disciplina1);

        //disciplina obrigatorias do curso 2
        curso2.adicionarDisciplinaObrigatoria(disciplina3);
        curso2.adicionarDisciplinaObrigatoria(disciplina4);
        curso2.adicionarDisciplinaObrigatoria(disciplina5);

        //disciplina eletivas do curso 2
        curso2.adicionarDisciplinaEletiva(disciplina2);

        //aluno graducao
        AlunoGraduacao alunoGraduacao1 = new AlunoGraduacao("Marcos","rua d", "66666",curso1);
        alunoGraduacao1.adicionarDisciplinasCursadas(disciplina4);
        alunoGraduacao1.adicionarDisciplinasCursadas(disciplina3);
        alunoGraduacao1.adicionarNotaDisciplina(disciplina4,50);
        alunoGraduacao1.adicionarNotaDisciplina(disciplina3, 70);
        alunoGraduacao1.calcularmedia();

        //aluno pos graduacao
        AlunoPosGraduacao alunoPosGraduacao1 = new AlunoPosGraduacao("Pedro", "rua 17", "929292", curso2, "Sistemas de Informação");
        alunoPosGraduacao1.adicionarDisciplinasCursadas(disciplina4);
        alunoPosGraduacao1.adicionarDisciplinasCursadas(disciplina3);
        alunoPosGraduacao1.adicionarDisciplinasCursadas(disciplina5);
        alunoPosGraduacao1.adicionarNotaDisciplina(disciplina3, 80);
        alunoPosGraduacao1.adicionarNotaDisciplina(disciplina4,70);
        alunoPosGraduacao1.adicionarNotaDisciplina(disciplina5,70);
        alunoPosGraduacao1.calcularmedia();


        //listas
        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);

        List<Professor> professores = new ArrayList<>();
        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);
        disciplinas.add(disciplina5);

        List<AlunoGraduacao> alunosGraduacao = new ArrayList<>();
        alunosGraduacao.add(alunoGraduacao1);

        List<AlunoPosGraduacao> alunosPosGraduacao = new ArrayList<>();
        alunosPosGraduacao.add(alunoPosGraduacao1);


        exibirTituloFaculdade();

        System.out.println("CURSOS: ");
        for(Curso curso : cursos){
            curso.apresentar();
        }

        espacamento();

        System.out.println("DISCIPLINAS: ");
        for (Disciplina disciplina : disciplinas){
            disciplina.apresentar();
        }

        espacamento();

        System.out.println("PROFESSORES: ");
        for (Professor professor : professores){
            professor.apresentar();
        }

        espacamento();

        System.out.println("ALUNOS: ");
        alunoGraduacao1.apresentar();
        alunoPosGraduacao1.apresentar();


        exibirTituloPolimorfismo();

        System.out.println("PESSOAS");
        List<AbstractPessoa> pessoas = new ArrayList<>();
        pessoas.add(professor1);
        pessoas.add(professor2);
        pessoas.add(professor3);
        pessoas.add(alunoGraduacao1);
        pessoas.add(alunoPosGraduacao1);


        for (AbstractPessoa pessoa : pessoas){
            pessoa.apresentar();
        }

        espacamento();

        System.out.println("ITEM ACADEMICO");
        List<AbstractItemAcademico> informacoes = new ArrayList<>();
        informacoes.add(curso1);
        informacoes.add(curso2);
        informacoes.add(disciplina1);
        informacoes.add(disciplina2);
        informacoes.add(disciplina3);
        informacoes.add(disciplina4);
        informacoes.add(disciplina5);

        for (AbstractItemAcademico itemAcademico : informacoes){
            itemAcademico.apresentar();
        }

    }

    public static void espacamento(){
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    }

    public static void exibirTituloFaculdade(){
        System.out.println();
        System.out.println("******************");
        System.out.println("FACULDADE");
        System.out.println("******************");
        System.out.println();
    }

    public static void exibirTituloPolimorfismo(){
        System.out.println();
        System.out.println();
        System.out.println("******************************");
        System.out.println("DEMOSTRAÇÃO DE POLIMOSRFISMO");
        System.out.println("******************************");
        System.out.println();
    }


}
