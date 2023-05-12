package lista06;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "Rua 1", "123456789", "01/01/2000");
        Curso curso1 = new Curso("Sistemas");
        Matricula matricula1 = new Matricula("123", aluno1, curso1, "01/01/2020");
       Turma turma1 = new Turma();
       turma1.addMatricula(matricula1);  
        
    }
}
