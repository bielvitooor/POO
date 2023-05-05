package exercicio6;

public class Pessoa {
    String nome;
    int idade;
    void fazAniversario(){
        this.idade=this.idade+1;
    }
    void show(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Idade:"+this.idade);
    }
}

