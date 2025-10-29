public class RandoMatrix {
    public static void main(String[] args) {
        RandoMatrix array = new RandoMatrix();
        int[][] matrix = new int[4][4];
        int temp = array.numAleatorios(matrix);
        System.out.print("\n qtd de numeros eh " + temp);
    }

    public int numAleatorios(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + (int)(Math.random() * 5);
                System.out.print(" " + matrix[i][j]);
                count++;
            }
            System.out.println(); 
        }
        return count;
    }
}