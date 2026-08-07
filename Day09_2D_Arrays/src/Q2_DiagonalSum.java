// Diagonal Sum

public class Q2_DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(digonalSum(matrix));
    }
    public static int digonalSum(int[][] matrix){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){ // i=j ans i+j = n-1 => j = n-1-i
            sum += matrix[i][i];

            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }
}
