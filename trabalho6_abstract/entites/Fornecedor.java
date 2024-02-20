package trabalho6_abstract.entites;

import java.util.ArrayList;
import java.util.List;

public abstract class Fornecedor {

    protected String nome;
    protected double rendaAnual;
    protected double imposto;

    public Fornecedor(){
    }
    public Fornecedor(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public double getImposto() {
        return imposto;
    }

    public abstract void impostoCalculo();
}
