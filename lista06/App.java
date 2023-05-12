package lista06;

public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setEndereco("Rua 1");
        aluno.setTelefone("1234-5678");
        aluno.setData_nascimento("01/01/2000");
        
        Curso curso = new Curso();
        curso.setNome("Java");
        curso.setDescricao("Curso de Java");
        curso.setData_inicio("01/01/2020");
        curso.setData_fim("01/07/2020");
        
        Matricula matricula = new Matricula();
        matricula.setCodigo("123");
        matricula.setAluno(aluno);
        matricula.setCurso(curso);
        matricula.setData_matricula("01/01/2020");
        
        Turma turma = new Turma();
        turma.setNome("Turma 1");
        turma.setMatriculas(matricula);
    }
}
