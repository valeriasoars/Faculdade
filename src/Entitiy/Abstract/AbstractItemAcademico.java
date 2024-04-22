package Entitiy.Abstract;

import Interface.IApresentar;

public abstract class AbstractItemAcademico implements IApresentar {
    protected String nome;
    protected String codigo;

    public AbstractItemAcademico(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

}
