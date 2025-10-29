public class Matrix {
    public static void main(String[] args) {
        Matrix array = new Matrix(); 
        int[][] matrix = new int[5][5];
        int temp = array.impares(matrix);
        System.out.print("\nA qtd de impares eh " + temp);
    }

    public int impares(int[][] matrix) {
        int count = 0;
        int x = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (x % 2 == 1) {
                    matrix[i][j] = x;
                    System.out.print(" " + matrix[i][j]);
                    count++;
                }
                x++;
            }
            System.out.println(); 
        }
        return count;
    }
}