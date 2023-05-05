package exercicio9;

public class Empresa {
    String nome;
    Empregado[] empregado = new Empregado[3];
    int i = 0;

    void add(Empregado empregado) {
        for (i = 0; i < this.empregado.length; i++) {
            this.empregado[i] = empregado;
        }
    }

    void showEmpregados() {
        for (i = 0; i < empregado.length; i++) {
            System.out.println("nome:" + empregado[i].nome);
            System.out.println("salário:" + empregado[i].salario);
        }
    }
}