package Classes;

import Classes.Abstrata.Pessoa;
import Classes.Interface.Apresentar;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private String departamento;
    private List<Disciplina> disciplinasMinistradas;


    public Professor(String nome, String endereco, String departamento ) {
        super(nome, endereco);
        this.departamento = departamento;
        this.disciplinasMinistradas = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(List<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinasMinistradas.add(disciplina);
    }


    @Override
    public void apresentar() {
        System.out.println("Nome professor: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        for (Disciplina disciplina: disciplinasMinistradas){
            System.out.println("Disciplinas ministradas: " + disciplina.getNome());

        }
    }
}
