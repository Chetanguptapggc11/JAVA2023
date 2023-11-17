public class MatrixSubtraction {
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] difference = new int[rows][columns];

        // Subtracting matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Displaying the result
        System.out.println("Subtraction of two matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }
}

