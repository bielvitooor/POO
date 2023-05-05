package exrevisao;

public class Banco {
    String Nome;
    Conta[] contas = new Conta[3];
    int contconta=0;
    Banco(String Nome){
        this.Nome=Nome;
    }
    @Override
    public String toString() {
        return "Nome do Banco: " + this.Nome;
    }

    void add(Conta conta) {
        if (contconta<contas.length ) {
            this.contas[contconta++] = conta;
            }
        }

    void showSaldoConta() {
        for(Conta conta:contas) {
        System.out.println("--------------------------------------------------");
            System.out.println("Titular: " + conta.getTitular().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Saldo Atualizado: " + conta.atualizarSaldo());
            System.out.println("--------------------------------------------------" );
        }
    }
}
