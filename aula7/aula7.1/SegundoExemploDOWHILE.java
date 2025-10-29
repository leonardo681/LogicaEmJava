public class SegundoExemploDOWHILE
{
    public static void main(String args[])
    {
        double saldo = 600.00;
        double retirada;
        
        do {
            retirada = Teclado.leDouble("Informe um valor para retirada: ");
            
            if (retirada > saldo) {
                System.out.println("Saldo indisponível para este valor de retirada.");
            }
        } while (retirada > saldo);
        
        saldo = saldo - retirada;
        
        System.out.println("Seu novo saldo é: " + saldo);
    }
}