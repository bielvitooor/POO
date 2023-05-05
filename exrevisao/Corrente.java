package exrevisao;

public class Corrente extends Conta {
    private double ValorDaCesta;//valor manutenção de conta
    Corrente(int numero, Titular titular_conta, double saldo,double ValorDaCesta) {
        super(numero, titular_conta, saldo);
        this.ValorDaCesta=ValorDaCesta;
    }
    
    @Override
    double atualizarSaldo() {
        double novovalor=super.getSaldo()-ValorDaCesta;
        return novovalor;
    }
}
