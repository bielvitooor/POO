package exercicio5;

public class ex5 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome ="Gabriel Vítor";
        f1.dataNascimento="19-03-2004";
        f1.dataContratacao="02-03-2023";
        f1.cargo="Gestor da S.I";
        f1.salario=9.000;
        f1.valorFerias();
        //f1.promover(2.456);
        f1.show();

    }
}
