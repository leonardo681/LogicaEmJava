public class ContaCorrente extends ContaBancaria {

    // Atributo privado para armazenar a taxa de operação da conta corrente
    private double taxaDeOperacao;

    // Construtor que recebe um saldo inicial e uma taxa de operação
    // Chama o construtor da superclasse para inicializar o saldo
    public ContaCorrente(double saldoInicial, double taxaDeOperacao) {
        super(saldoInicial);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    // Sobrescrita do método da superclasse para imprimir o saldo da conta corrente
    @Override
    public void imprimirSaldo() {
        System.out.println("Saldo da conta corrente: " + this.saldo);
    }
}
