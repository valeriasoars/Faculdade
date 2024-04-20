package Classes;
import Classes.Abstrata.ItemAcademico;
import Classes.Interface.Apresentar;

import java.util.ArrayList;
import java.util.List;

public class Curso extends ItemAcademico  {

    private List<Disciplina> disciplinasObrigatorias;
    private List<Disciplina> disciplinasEletivas;

    public Curso(String nome, String codigo) {
        super(nome, codigo);
        this.disciplinasObrigatorias = new ArrayList<>();
        this.disciplinasEletivas = new ArrayList<>();
    }


    public List<Disciplina> getDisciplinasObrigatorias() {
        return disciplinasObrigatorias;
    }

   /* public void setDisciplinasObrigatorias(List<Disciplina> disciplinasObrigatorias) {
        this.disciplinasObrigatorias = disciplinasObrigatorias;
    }

    public List<Disciplina> getDisciplinasEletivas() {
        return disciplinasEletivas;
    }

    public void setDisciplinasEletivas(List<Disciplina> disciplinasEletivas) {
        this.disciplinasEletivas = disciplinasEletivas;
    }*/

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
    }
}
