package exrevisao;

public abstract class Conta {//classes abstratas não podem ser instanciadas
    private int numero;
    private Titular titular_conta;
    private double saldo;

    Conta(int numero,Titular titular_conta,double saldo){
        this.numero=numero;
        this.titular_conta= titular_conta;
        this.saldo=saldo;
    }
    abstract double atualizarSaldo();//metodo abstrato não tem corpo
    double getSaldo(){
        return this.saldo;
    }
    double getNumero(){
        return this.numero;
    }
    Titular getTitular(){
        return this.titular_conta;
    }
}