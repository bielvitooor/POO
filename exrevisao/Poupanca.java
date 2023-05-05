package exrevisao;

public class Poupanca extends Conta {
    private double taxaDeJuros;//juros aplicado mensalmente
    Poupanca(int numero, Titular titular_conta,double saldo,double taxaDeJuros) {
        super(numero, titular_conta,saldo);
        this.taxaDeJuros = taxaDeJuros;
    }
    @Override
    double atualizarSaldo() {
        double novovalor= super.getSaldo()+(super.getSaldo()*(taxaDeJuros/100));
        return novovalor;

    }
    
}
