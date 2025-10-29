public class MediaMatrix {
    public static void main(String[] args) {
        MediaMatrix array = new MediaMatrix();
        int[][] matrix = new int[2][2];
        double temp = array.calculaMedia(matrix);
        System.out.print("\nA media eh " + temp);
    }

    public double calculaMedia(int[][] matrix) {
        int count = 0;
        double soma = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Teclado.leInt("Digite um numero: ");
                soma = soma + matrix[i][j];
                count++;
            }
        }
        return soma / count;
    }
}