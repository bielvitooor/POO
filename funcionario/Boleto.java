package funcionario;

public class Boleto implements Pagavel {
    int numero;
    String descricao;
    double valor;
Boleto(int numero, String descricao, double valor){
    this.numero=numero;
    this.descricao=descricao;
    this.valor=valor;
}
    @Override
    public double valorPagamento(){
        return this.valor;
    };
    
}
