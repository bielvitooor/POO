package lista06;
public class Matricula {
    private String codigo;
    private Aluno aluno;
    private Curso curso;
    private String data_matricula;
    public Matricula(String string, Aluno aluno, Curso curso, String data_matricula){
        this.codigo = string;
        this.aluno = aluno;
        this.curso = curso;
        this.data_matricula = data_matricula;
    }
    @Override
    public String toString() {
        return this.codigo;
    }
}
