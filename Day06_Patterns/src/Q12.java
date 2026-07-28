// pattern Zig-Zag Pattern
//
//  *   *   *
// * * * * *
//*   *   *

public class Q12 {
    public static void main(String[] args) {
        zigZigProblem(4);
    }

    public static void zigZigProblem(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4 * n - 3; j++) {

                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
