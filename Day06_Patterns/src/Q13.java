//Pattern Spiral Matrix
//
//1  2  3  4
//12 13 14 5
//11 16 15 6
//10 9  8  7
public class Q13 {

    public static void spiralMatrix(int n) {

        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            // Left to Right
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        // Print Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spiralMatrix(4);
    }
}
