package trabalho2.util;

public class ContaBancaria {

    private int nroConta;
    private String nomeTitular;
    private double saldo = 0;

    public ContaBancaria(){

    }
    public ContaBancaria(int nroConta, String nomeTitular, double depInicial) {
        this.nroConta = nroConta;
        this.nomeTitular = nomeTitular;
        deposito(depInicial);
    }

    public ContaBancaria(int nroConta, String nomeTitular) {
        this.nroConta = nroConta;
        this.nomeTitular = nomeTitular;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= (valor + 5);
    }

    public int getNroConta() {
        return nroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta= " + nroConta +
                ", Titular= " + nomeTitular +
                ", Saldo= R$" +
                String.format("%.2f", saldo);
    }
}
