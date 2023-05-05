package funcionario;

public class Horista extends Funcionario {
    double valorhora;
    double horastrabalhas;

    Horista(String nome, String sobrenome, String CPF, double valorhora, double horastrabalh) {
        super(nome, sobrenome, CPF);
        this.valorhora = valorhora;
        this.horastrabalhas = horastrabalh;
    }
    public String tosString(){
        return "Nome: "+this.getNome()+" "+this.getSobrenome()+"\nCPF: "+this.getCPF()+"\nSalario: "+this.salario();
    }
    @Override
    public double salario() {
        if(this.horastrabalhas>40){
            double gannhostotais = (this.valorhora * 40) + (this.valorhora * 1.5 * (this.horastrabalhas - 40));
            return gannhostotais;
        }
        else{
            double gannhostotais = this.valorhora * this.horastrabalhas;
            return gannhostotais;
        }
    }
    @Override
    public double valorPagamento() {
        return this.salario();
    }

}

