package exercicio7;

public class Porta {
    boolean aberta;
    String cor;
    double altura;
    double largura;
    void abrir(){
        this.aberta=true;
    }
    void fechar(){
        this.aberta=false;
    }
    void pintar(String cor){
        this.cor=cor;
    }
    boolean estaAberta(){
        if(aberta==true){
            System.out.println("A porta esta aberta.");
            return true;
        }
        else{
            System.out.println("A porta está fechadaad");
            return false;
        }
    }
}
