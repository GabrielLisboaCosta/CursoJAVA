package trabalho1.util;

public class CurrencyConverter {
    public static final double iof = 0.06;

    public static double converter(double dolar, double reais){
        double semImposto =  reais * dolar;
        double imposto = semImposto * iof;
        return semImposto + imposto;
    }
}
