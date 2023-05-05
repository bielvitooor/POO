package funcionario;

public abstract class Funcionario implements Pagavel {
    private String nome;
    private String sobrenome;
    private String CPF;
    public Funcionario(String nome,String sobrenome,String CPF){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.CPF=CPF;
    }
public abstract double salario();
public String getNome() {
    return nome;
    }
public String getSobrenome() {
    return sobrenome;
    }
public String getCPF() {
    return CPF;
    }
public void gannhos(){
    System.out.println("Nome: "+this.getNome()+" "+this.getSobrenome());
    System.out.println("CPF: "+this.getCPF()+"\n");
    System.out.println("Ganhos totais: "+this.salario());
}

}
