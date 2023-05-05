package exercicio2;

public class ex2 {
    public static void main(String[] args) {

    Conta c1= new Conta();
    c1.number=12340;
    c1.correntista="Gabriel";
    c1.saldo=10;
    c1.sacar(5);
    c1.depositar(10);
    Conta c2 = new Conta();
    c2.number=12345;
    c2.correntista="Caio";
    c2.saldo=0;
    c1.transferir(c2, 10);
    System.out.println("saldo:"+c1.saldo);
    System.out.println("saldo conta destino:"+c2.saldo);
    }
    
}
