package exercicio1;
public class Conta {
    int number;
    String correntista;
    double saldo;
    void sacar(double valor) {
        if (this.saldo<valor){
            System.out.println("Valor Indisponível|Operação não concluida");
            System.out.println("Saldo atual:"+this.saldo);
        }
        else{
            this.saldo = this.saldo-valor;
            System.out.println("Operação concluida");
            System.out.println("Saldo atual:"+this.saldo);
        }
    }

    void depositar(double valor) {
        valor = this.saldo + valor;
        this.saldo = valor;
        System.out.println("Operação concluida");
        System.out.println("Saldo atual:"+this.saldo);
    }
}