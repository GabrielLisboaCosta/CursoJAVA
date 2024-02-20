package trabalho6_abstract.entites;

public class PessoaFisica extends Fornecedor{
    private double gasComSau;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gasComSau) {
        super(nome, rendaAnual);
        this.gasComSau = gasComSau;
        impostoCalculo();
    }

    public double getGasComSau() {
        return gasComSau;
    }

    public void setGasComSau(double gasComSau) {
        this.gasComSau = gasComSau;
    }

    @Override
    public void impostoCalculo() {
        if(rendaAnual<20000){
            imposto = (rendaAnual * 0.15)-(gasComSau * 0.5);
        } else if (rendaAnual>=20000) {
            imposto = (rendaAnual * 0.25)-(gasComSau * 0.5);
        }
    }
}
