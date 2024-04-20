import Classes.*;
import Classes.Abstrata.ItemAcademico;
import Classes.Abstrata.Pessoa;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        //cursos
        Curso curso1 = new Curso("Ciência da Computação", "1010");
        Curso curso2 = new Curso(" Engenharia de Software", "2020");


        //professores
        Professor professor1 = new Professor("Claudia", "Rua a", "Informática");
        Professor professor2 = new Professor("Luiz", "Rua b", "Informática");
        Professor professor3 = new Professor("Marcia", "Rua c", "Informática");

        //discplinas
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


        //obrigatorias do curso 1
        curso1.adicionarDisciplinaObrigatoria(disciplina3);
        curso1.adicionarDisciplinaObrigatoria(disciplina4);

        //eletivas do curso 1
        curso1.adicionarDisciplinaEletiva(disciplina1);

        //obrigatorias do curso 2
        curso2.adicionarDisciplinaObrigatoria(disciplina3);
        curso2.adicionarDisciplinaObrigatoria(disciplina4);
        curso2.adicionarDisciplinaObrigatoria(disciplina5);

        //eletivas do curso 2
        curso2.adicionarDisciplinaEletiva(disciplina2);

        //alunos
        /*Aluno aluno1 = new Aluno("Roberta", "Rua d", "111111", curso1);
        Aluno aluno2 = new Aluno("Carlos", "Rua e", "222222", curso1);
        Aluno aluno3 = new Aluno("Maria", "Rua f", "333333", curso2);*/



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

        /*List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);*/


        System.out.println("******************");
        System.out.println("FACULDADE");
        System.out.println("******************");
        System.out.println();

        System.out.println("CURSOS: ");
        for(Curso curso : cursos){
            curso.apresentar();
            System.out.println("-----");
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();


        System.out.println("DISCIPLINAS: ");
        for (Disciplina disciplina : disciplinas){
            disciplina.apresentar();
            System.out.println("-----");
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.println("PROFESSORES: ");
        for (Professor professor : professores){
            professor.apresentar();
            System.out.println("-----");
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*System.out.println("ALUNOS: ");
        for (Aluno aluno : alunos){
            aluno.apresentar();
            System.out.println("-----");
        }*/


        System.out.println("ALUNOS: ");

        //aluno graducao
        AlunoGraduacao alunoGraduacao1 = new AlunoGraduacao("Marcos","rua d", "66666",curso1);
        alunoGraduacao1.disciplinasCursadas(disciplina4);
        alunoGraduacao1.disciplinasCursadas(disciplina3);
        alunoGraduacao1.adicionarNotaDisciplina(disciplina4,50);
        alunoGraduacao1.adicionarNotaDisciplina(disciplina3, 70);
        alunoGraduacao1.calcularmedia();
        alunoGraduacao1.apresentar();

        System.out.println();
        System.out.println("-----");

        //aluno pos graduacao
        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao("Pedro", "rua 17", "929292", curso2);
        alunoPosGraduacao.disciplinasCursadas(disciplina4);
        alunoPosGraduacao.disciplinasCursadas(disciplina3);
        alunoPosGraduacao.disciplinasCursadas(disciplina5);
        alunoPosGraduacao.adicionarNotaDisciplina(disciplina3, 80);
        alunoPosGraduacao.adicionarNotaDisciplina(disciplina4,70);
        alunoPosGraduacao.adicionarNotaDisciplina(disciplina5,70);
        alunoPosGraduacao.calcularmedia();
        alunoPosGraduacao.apresentar();


        System.out.println();
        System.out.println();

        System.out.println("******************************");
        System.out.println("DEMOSTRAÇÃO DE POLIMOSRFISMO");
        System.out.println("******************************");
        System.out.println();

        System.out.println("PESSOAS");
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(professor1);
        pessoas.add(professor2);
        pessoas.add(professor3);
        pessoas.add(alunoGraduacao1);
        pessoas.add(alunoPosGraduacao);


        for (Pessoa pessoa : pessoas){
            pessoa.apresentar();
            System.out.println("-----");
        }

        System.out.println();
        System.out.println();

        System.out.println("ITEM ACADEMICO");
        List<ItemAcademico> informacoes = new ArrayList<>();
        informacoes.add(curso1);
        informacoes.add(curso2);
        informacoes.add(disciplina1);
        informacoes.add(disciplina2);
        informacoes.add(disciplina3);
        informacoes.add(disciplina4);
        informacoes.add(disciplina5);

        for (ItemAcademico itemAcademico : informacoes){
            itemAcademico.apresentar();
            System.out.println("-----");
        }

    }
}
/*  System.out.println("******************");
        System.out.println("FACULDADE");
        System.out.println("******************");
        System.out.println();

        System.out.println("CURSOS: ");
        curso1.apresentar();
        System.out.println("-----");
        curso2.apresentar();

        System.out.println();
        System.out.println("---------------------");
        System.out.println();


        System.out.println("DISCIPLINAS: ");
        disciplina1.apresentar();
        System.out.println("-----");
        disciplina2.apresentar();
        System.out.println("-----");
        disciplina3.apresentar();
        System.out.println("-----");
        disciplina4.apresentar();
        System.out.println("-----");
        disciplina5.apresentar();

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.println("PROFESSORES: ");
        professor1.apresentar();
        System.out.println("-----");
        professor2.apresentar();
        System.out.println("-----");
        professor3.apresentar();


        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.println("ALUNOS: ");
        aluno1.apresentar();
        System.out.println("-----");
        aluno2.apresentar();
        System.out.println("-----");
        aluno3.apresentar();

        System.out.println();

        System.out.println();*/