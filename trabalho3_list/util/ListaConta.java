package trabalho3_list.util;

import java.util.ArrayList;
import java.util.List;

public class ListaConta {
     private int id;
    private String nome;
    private double salario;
    private static final List<ListaConta> listaGeral = new ArrayList<>();

    public ListaConta() {
    }

    public ListaConta(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        listaGeral.add(this);
    }

    public void aumento(double x){
        double porcent = (salario*x) / 100;
        salario += porcent;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public List<ListaConta> getListaGeral() {
        return listaGeral;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", nome= " + nome +
                ", salario= R$" +
                String.format("%.2f", salario);
    }
}
