package lista06;
public class Aluno{
    private String nome;
    private String endereco;
    private String telefone;
    private String data_nascimento;
public Aluno(String nome, String endereco, String telefone, String data_nascimento){
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.data_nascimento = data_nascimento;
}
@Override
public String toString() {
    return this.nome;
}
    
}