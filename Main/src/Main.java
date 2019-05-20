public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        ReverseMatrix(matrix);
    }

    public static void ReverseMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
