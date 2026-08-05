// Create a program to find the sum of two diagonal elements.
public class CQ50 {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(nums));
    }
    public static int diagonalSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j) {
                    sum += nums[i][j];
                } else if (i + j == nums.length - 1) {
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }
}