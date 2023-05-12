package lista06;
public class Aluno{
    private String nome;
    private String endereco;
    private String telefone;
    private String data_nascimento;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getAluno(String nome) {
        return nome;
    }
    public String getEndereco(String endereco) {
        return endereco;
    }
    
}