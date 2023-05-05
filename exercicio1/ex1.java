package exercicio1;

public class ex1 {
    public static void main(String[]args){
        Conta c1= new Conta();
        c1.number=1234;
        c1.correntista="Gabriel";
        c1.saldo=10;
        c1.sacar(5);
        c1.depositar(10);
        
    }
}
