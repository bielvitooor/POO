package exrevisao;

public class Titular {
    private String nome;
    private String cpf;
    Titular(String nome,String string){
    this.nome=nome;
    this.cpf=string;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
}
