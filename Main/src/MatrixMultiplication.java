public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2,3},
                            {4, 5,6}};

        int[][] matrix2 = {{7, 8},
                           {9, 10},
                           {11, 12}};
        matrixmultiplication(matrix1, matrix2);
    }

    public static void matrixmultiplication(int[][] matrix1, int matrix2[][]) {
        if (matrix1[0].length == matrix2.length) {
            int[][] matrix = new int[matrix1.length][matrix2[0].length];
            int sum = 0;

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int l = 0; l < matrix2.length; l++) {
                        sum = sum + matrix1[i][l] * matrix2[l][j];
                    }
                    matrix[i][j] = sum;
                    sum = 0;
                }

            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Enable to multiple the matrices as the the number of columns in the first factor doesn't equal to the number of rows in the second");
            System.exit(0);
        }
    }
}
