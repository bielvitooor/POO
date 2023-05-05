package exercicio9;

public class Main {
    public static void main(String[] args) {
        Empregado p1=new Empregado();
        Empregado p2 = new Empregado();
        p2.nome="Maria";
        p2.salario=1000;     
        p1.nome="Vanilda";
        p1.salario=1600;
        Empresa e1 = new Empresa();
        e1.nome="LinuxEnterprise";
        e1.add(p1);
        e1.showEmpregados();
        
    }
}
