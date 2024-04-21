package Entitiy;
import Entitiy.Abstract.AbstractItemAcademico;

import java.util.ArrayList;
import java.util.List;

public class Curso extends AbstractItemAcademico {

    private List<Disciplina> disciplinasObrigatorias;
    private List<Disciplina> disciplinasEletivas;

    public Curso(String nome, String codigo) {
        super(nome, codigo);
        this.disciplinasObrigatorias = new ArrayList<>();
        this.disciplinasEletivas = new ArrayList<>();
    }


    public void adicionarDisciplinaObrigatoria(Disciplina disciplina) {
        disciplinasObrigatorias.add(disciplina);
    }

    public void adicionarDisciplinaEletiva(Disciplina disciplina) {
        disciplinasEletivas.add(disciplina);
    }

    @Override
    public void apresentar() {

        System.out.println("Nome do curso: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Disciplinas obrigatorias: ");
        for (Disciplina disciplina : disciplinasObrigatorias){
            System.out.println("- " + disciplina.getNome());
        }
        System.out.println("Disciplinas eletivas: ");
        for (Disciplina disciplina : disciplinasEletivas){
            System.out.println("- " + disciplina.getNome());
        }
        System.out.println("-----");
    }
}
