package exercicio7;

public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    void pintarCaasa(String cor){
        this.cor=cor;
    }
    int quantasPortasAbertas(){
        int cont=0;
        if(porta1.aberta){
            cont++;
        }
        if(porta2.aberta){
            cont++;
        }
        if(porta3.aberta){
            cont++;
        }
        return cont;
    }
}
