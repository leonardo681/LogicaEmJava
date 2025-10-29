public class TesteContas {
    public static void main(String[] args) {
        // Cria uma conta corrente com saldo inicial de 1000 e taxa de operação de 10
        ContaBancaria conta1 = new ContaCorrente(1000, 10);
        // Cria uma conta poupança com saldo inicial de 2000 e taxa de juros de 0.05
        ContaBancaria conta2 = new ContaPoupanca(2000, 0.05);

        // Deposita 500 na conta corrente
        conta1.depositar(500);
        // Deposita 1000 na conta poupança
        conta2.depositar(1000);

        // Imprime o saldo da conta corrente
        // Deve imprimir o saldo atualizado após o depósito
        conta1.imprimirSaldo();

        // Imprime o saldo da conta poupança
        // Deve imprimir o saldo atualizado após o depósito
        conta2.imprimirSaldo();
    }
}