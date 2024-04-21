package Entitiy.Abstract;

import Entitiy.Interface.IApresentar;

public abstract class AbstractPessoa implements IApresentar {
    protected String nome;
    protected String endereco;

    public AbstractPessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}