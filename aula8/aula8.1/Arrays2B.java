public class Arrays2B {
    public static void main(String[] args) {
        Arrays2B arrays = new Arrays2B(); 
        double[] notas = new double[3];
        double temp = arrays.digitalkota(notas);
        System.out.print("A media eh: " + temp);
    }

    public double digitalkota(double[] vet) {
        double soma = 0;
        int count = 0;
        double media = 0;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Teclado.leDouble("Digite uma nota: ");
            
            if (vet[i] < 0.0 || vet[i] > 10.0) {
                do {
                    System.out.println("Nota inválida!!");
                    vet[i] = Teclado.leDouble("Digite outra nota: ");
                } while (vet[i] < 0.0 || vet[i] > 10.0);
            }
            
            soma = soma + vet[i];
            count++;
        }
        
        media = soma / count;
        return media;
    }
}