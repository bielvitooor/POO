package exrevisao;

public class Main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Gabriel","00000000000");
        Titular titular3 = new Titular("Livia","000000000000");
        
        Corrente conta1 = new Corrente(1, titular1, 10.0, 5);
        Corrente conta2 = new Corrente(2, titular1, 20.0,2.50);
        Poupanca conta3 = new Poupanca(1, titular3, 5.0,5);
        Banco banco1=new Banco("Caixa");
        banco1.add(conta1);
        banco1.add(conta2);
        banco1.add(conta3);
        banco1.showSaldoConta();
        System.out.println(banco1);//toString -quando manda imprimir o objeto 

    }
}
