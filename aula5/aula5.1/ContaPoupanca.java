public class ContaPoupanca extends ContaBancaria {
    // Atributo privado para armazenar a taxa de juros da conta poupança
    private double taxaDeJuros;

    // Construtor que recebe um saldo inicial e uma taxa de juros
    // Chama o construtor da superclasse para inicializar o saldo
    public ContaPoupanca(double saldoInicial, double taxaDeJuros) {
        super(saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }

    // Sobrescrita do método da superclasse para imprimir o saldo da conta poupança
    @Override
    public void imprimirSaldo() {
        System.out.println("Saldo da conta poupança: " + this.saldo);
    }
}
