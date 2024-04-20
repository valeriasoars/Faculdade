package Classes.Abstrata;

import Classes.Interface.Apresentar;

public abstract class ItemAcademico implements Apresentar {
    protected String nome;
    protected String codigo;

    public ItemAcademico(String nome, String codigo) {
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
