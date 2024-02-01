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
        this.saldo = depInicial;
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


    @Override
    public String toString() {
        return "Conta= " + nroConta +
                ", Titular= " + nomeTitular +
                ", Saldo= R$" + saldo;
    }
}
