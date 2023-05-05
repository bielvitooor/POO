package exercicio2;
public class Conta{
    int number;
    String correntista;
    double saldo;

    boolean sacar(double valor) {
        if (this.saldo<valor){
            System.out.println("Valor Indisponível|Operação não concluida");
            System.out.println("Saldo atual:"+this.saldo);
            return false;
        }
        else{
            this.saldo = this.saldo-valor;
            System.out.println("Operação concluida");
            System.out.println("Saldo atual:"+this.saldo);
            return false;
        }
    }

    void depositar(double valor) {
        valor = this.saldo + valor;
        this.saldo = valor;
        System.out.println("Operação concluida");
        System.out.println("Saldo atual:"+this.saldo);

    }
    void transferir(Conta destino, double valor){
        if(valor>this.saldo){
            System.out.println("Valor Indisponível|Operação não concluida");
            System.out.println("Saldo atual:"+this.saldo);
        }
        else{
            this.saldo=this.saldo-valor;
            destino.saldo=valor;
            System.out.println("Operação concluida");
            System.out.println("Saldo atual:"+this.saldo);
        }
    }
}
