// Question 1: Count the Number of 7's in a 2D Array
//Problem Statement
//Write a Java program to count how many times the number 7 appears in a given 2D array.

public class PQ1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {7,3,4,5,23},
                {4,5,7,7,7},
                {45,67,43,6,7},
                {23,5,6,77,7}
        };
        System.out.println(count(matrix,5));
    }
    public static int count(int[][] mat, int num){
        int counts = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == num){
                    counts++;
                }
            }
        }
        return counts;
    }
}
