package funcionario;

public class Comissionado extends Funcionario {
    double valorvendas;
    double taxacomissao;

    Comissionado(String nome, String sobrenome, String CPF,double valorvendas, double taxacomissao) {
        super(nome, sobrenome, CPF);
        this.valorvendas = valorvendas;
        this.taxacomissao = taxacomissao;
    }
    @Override
    public double salario() {
        double gannhostotais =(this.valorvendas * (this.taxacomissao/100))+this.valorvendas;
        return gannhostotais;
    }
    @Override
    public double valorPagamento() {
        return this.salario();
    }
}
    
