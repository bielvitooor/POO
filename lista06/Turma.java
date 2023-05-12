package lista06;
import java.util.List;
import java.util.ArrayList;

public class Turma {
    private String nome;
    private List<Matricula> matriculas;
    public Turma(){
        this.matriculas = new ArrayList<>();
    }
    public List<Matricula> getMatriculas(){
        return this.matriculas;
    }
    public void addMatricula(Matricula m){
        this.matriculas.add(m);
    }
}
