package exercicio7;
public class ex7 {
    public static void main(String[] args) {
        Casa c1=new Casa();
        c1.pintarCaasa("Azul");
        Porta p1 = new Porta();
        p1.cor="Marrom";
        p1.aberta=true;
        p1.altura=2.10;
        p1.largura=1.60;
        Porta p2=new Porta();
        p2.aberta=false;
        p2.altura=3.50;
        p2.largura=4.50;
        p2.cor="vermelha";
        Porta p3=new Porta();
        p3.cor="magenta";
        p3.aberta=false;
        p3.altura=3.20;
        p3.largura=2.30;
        c1.porta1=p1;
        p1.estaAberta();
        c1.porta2=p2;
        p2.fechar();
        c1.porta3=p3;
        p3.abrir();
        int abertas=c1.quantasPortasAbertas();
        c1.pintarCaasa("Branco");
        p1.cor="Vermelho";
        System.out.println("Cor da porta 1:"+c1.porta1.cor);
        System.out.println("Quantas portas abertas?:"+abertas);
        System.out.println("Qual a cor da casa? "+c1.cor);
    }
}