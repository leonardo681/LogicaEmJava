public class QuartoExemploFOR {
    public static void main(String args[]) {
        double emprestimo = Teclado.leDouble("Informe um valor para o emprestimo: ");
        int parcelas = Teclado.leInt("Informe a qtde de parcelas para o emprestimo (1-12): ");
        double valorParcela = emprestimo / parcelas;
        
        for(int contador = 1; contador <= parcelas; contador++) {
            double parcelaComJuros = valorParcela + (valorParcela * 0.05);
            System.out.printf("O valor da parcela %d é: %4.2f \n", contador, parcelaComJuros);
        }
    }
}