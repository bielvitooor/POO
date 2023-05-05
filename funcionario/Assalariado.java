package funcionario;

public class Assalariado extends Funcionario {
    double valorsemana;

    Assalariado(String nome, String sobrenome, String CPF, double valorsemana) {
        super(nome, sobrenome, CPF);
        this.valorsemana = valorsemana;

    }
    @Override
    public double salario() {
        double gannhostotais = this.valorsemana;
        return gannhostotais;
    }
    @Override
    public double valorPagamento() {
        return this.salario();
    }
}
