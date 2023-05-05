package exercicio4;

public class ex4 {
    public static void main(String[] args) {

        Conta c1= new Conta();
        Cliente p1=new Cliente();
        p1.nome="Gabriel";
        p1.sobrenome="Brito";
        p1.endereco="Rua 21";
        c1.number=12340;
        c1.saldo=10;
        c1.correntista=p1;
        System.out.println("Nome do correntista:"+p1.concat());
        c1.sacar(5);
        c1.depositar(10);
        Conta c2 = new Conta();
        c2.number=12345;
        c2.saldo=0;
        c1.transferirPara(c2, 10);
        System.out.println("saldo:"+c1.saldo);
        System.out.println("saldo conta destino:"+c2.saldo);
        }
}

