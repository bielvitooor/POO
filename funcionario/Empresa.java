package funcionario;

public class Empresa {
    String nome;
    Funcionario[] funcionarios=new Funcionario[4];
    Empresa(String nome){
        this.nome=nome;
    }
    public void add(Funcionario funcionario){
        for(int i=0;i<funcionarios.length;i++){
            if(funcionarios[i]==null){
                funcionarios[i]=funcionario;
                break;
            }
        }
    }
    public void ganhos(){
        for(Funcionario funcionario:funcionarios){
            funcionario.gannhos();
        }
    }
}
