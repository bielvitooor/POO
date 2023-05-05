package exjava;

public class Aluno {
    String nome;
    String telefone;
    double[] nota=new double[4];
    int i=0;

double media(double media){
    for(i=0;i<nota.length;i++){
        double soma=+nota[i];
        media=soma/4;
    }
    i=0;
    return media;
}
void mostrar(){
    System.out.println("Nome:"+ this.nome);
    System.out.println("Telefone:"+this.telefone);
}
}