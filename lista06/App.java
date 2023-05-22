package lista06;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "Rua 1", "123456789", "01/01/2000");
        Aluno aluno2= new Aluno("Gabriel","Rua 21","62986073404","19/03/2004");
        Curso curso1 = new Curso("Sistemas");
        Matricula matricula1 = new Matricula("123", aluno1, curso1, "01/01/2020");
        Matricula matricula2=new Matricula("22345", aluno2, curso1,"11/05/2023");
       Turma turma1 = new Turma();
       turma1.addMatricula(matricula1);
       turma1.addMatricula(matricula2); 
       for(Matricula matricula: turma1.getMatriculas()){
        System.out.println(matricula);
       }
        
    }
}
