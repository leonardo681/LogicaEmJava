public class Array4B {
    public static void main(String[] args) {
        Array4B arrays = new Array4B(); 
        int[] notas = new int[88];
        int temp = arrays.digitalMeta(notas);
        System.out.print("A quantidade de numeros múltiplos comuns de 3 e 5 eh: " + temp);
    }

    public int digitalMeta(int[] vet) {
        int count = 0;
        
        for (int i = 1; i < vet.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                vet[i] = i;
                System.out.println(vet[i]);
                count++;
            }
        }
        
        System.out.println("Esses são múltiplos comuns de 3 e 5");
        System.out.println("Tamanho do Array eh: " + vet.length);
        return count;
    }
}