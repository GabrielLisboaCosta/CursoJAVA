package trabalho6_abstract.entites;

public class PessoaJuridica extends Fornecedor{
    private double nroFunc;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, double nroFunc) {
        super(nome, rendaAnual);
        this.nroFunc = nroFunc;
        impostoCalculo();
    }

    public double getNroFunc() {
        return nroFunc;
    }

    public void setNroFunc(double nroFunc) {
        this.nroFunc = nroFunc;
    }

    @Override
    public void impostoCalculo() {
        if(nroFunc>10){
            imposto = (rendaAnual * 0.14);
        } else if (nroFunc<=10) {
            imposto= (rendaAnual * 0.16);
        }
    }
}
