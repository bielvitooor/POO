package exercicio4;

public class Conta{
    int number;
    Cliente correntista;
    double saldo;
    double limite;

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
            return true;
        }
    }

    void depositar(double valor) {
        this.saldo = this.saldo+valor;
        System.out.println("Operação concluida");
        System.out.println("Saldo atual:"+this.saldo);

    }
    boolean transferirPara(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        else{
            System.out.println("Valor Indisponível|Operação não concluida");
            System.out.println("Saldo atual:"+this.saldo);
            return false;
        }}
        public String getNomeCorrentista() {
            return this.correntista.concat();
        }
        
}
