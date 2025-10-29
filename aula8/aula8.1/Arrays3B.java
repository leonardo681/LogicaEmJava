public class Arrays3B {
    public static void main(String[] args) {
        Arrays3B arrays = new Arrays3B();
        int[] notas = new int[3];
        float temp = arrays.digitalkota(notas);
        System.out.printf("A media eh %.2f", temp);
    }

    public float digitalkota(int[] vet) { 
        int soma = 0;
        int count = 0;
        float media = 0;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Teclado.leInt("Digite uma nota: ");
            
            if (vet[i] < 0 || vet[i] > 10) {
                do {
                    System.out.println("Nota invalida!");
                    vet[i] = Teclado.leInt("Digite outra nota: ");
                } while (vet[i] < 0 || vet[i] > 10);
            }
            
            soma = soma + vet[i];
            count++;
        }
        
        media = (float) soma / count;
        return media;
    }
}