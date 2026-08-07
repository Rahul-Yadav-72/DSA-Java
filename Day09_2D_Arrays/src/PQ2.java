//Question 2: Sum of Elements in the Second Row of a 2D Array
//Problem Statement
//Write a Java program to find and print the sum of all elements present in the second row of a given 2D array.

public class PQ2 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {9,8,7}
        };
        System.out.println(sumOfSecondRow(mat));
    }
    public static int sumOfSecondRow(int[][] mat){
        int sum =0 ;
        for(int i=0; i<mat[0].length; i++){
            sum += mat[1][i];
        }
        return sum;
    }
}
