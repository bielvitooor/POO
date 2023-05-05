package exercicio5;
public class Funcionario{
    String nome;
    String dataNascimento;
    String dataContratacao;
    String cargo;
    double salario;
    double valorFerias(){
        return this.salario+(this.salario*0.3);
    }
    void promover(double valor){
        this.salario=this.salario+valor;
    }
    double salarioAnual(){
        return (this.salario*11)+valorFerias();
    }
    void show(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Data de Nascimento:"+dataNascimento);
        System.out.println("Data Contratação:"+dataContratacao);
        System.out.println("Cargo:"+cargo);
        System.out.println("Salario:$"+salario);
        System.out.println("Férias:$"+valorFerias());
        System.out.println("Salário Anual:"+salarioAnual());
    }
}