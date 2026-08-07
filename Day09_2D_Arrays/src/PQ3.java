//Question 3: Find the Transpose of a Matrix
//Problem Statement
//Write a Java program to find and print the transpose of a given matrix.
//What is a Transpose?
//The transpose of a matrix is obtained by converting all rows into columns and all columns into rows.
//In other words: The element at position (row, column) becomes (column, row).

public class PQ3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {23,43,254},
                {2,3,5},
                {32,67,88}
        };
        int[][] ans = transposeMatrix(matrix);
        printMatrix(ans);
    }
    public static void printMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] mat){
        int[][] ans = new int[mat[0].length][mat.length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                ans[j][i] = mat[i][j];
            }
        }
        return ans;
    }
}
