package funcionario;

public class BaseComissao extends Funcionario {
    double valorvendas;
    double taxacomissao;
    double salarioBase;

    BaseComissao(String nome, String sobrenome, String CPF,double valorvendas, double taxacomissao, double salarioBase) {
        super(nome, sobrenome, CPF);
        this.valorvendas = valorvendas;
        this.taxacomissao = taxacomissao;
        this.salarioBase = salarioBase;
    }
    @Override
    public double salario() {
        double gannhostotais =(this.valorvendas * this.taxacomissao)+this.valorvendas+this.salarioBase;
        return gannhostotais;
    }
    @Override
    public double valorPagamento() {
        return this.salario();
    }
}
