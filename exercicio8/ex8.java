package exercicio8;

public class ex8 {
    public static void main(String[] args) {
        Cliente p1=new Cliente();
        p1.nome="Gabriel";
        p1.sobrenome="Brito";
        p1.endereco="Rua Uberlândia Q.07 L.06";
        Conta c1 = new Conta();
        c1.number = 1234;
        c1.correntista = p1;
        System.out.printf("\nNome do correntista: %s %s\n",c1.correntista.nome,c1.correntista.sobrenome);
        System.out.println("Saldo da conta:"+c1.getSaldo());

    }
}
