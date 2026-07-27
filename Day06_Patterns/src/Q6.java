// Pattern Hollow Diamond
//   *
//  * *
// *   *
//*     *
// *   *
//  * *
//   *
public class Q6 {
    public static void hollowDiamond(int n){
        for(int i=1; i<=n; i++){
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            // Print second star except first row
            if (i > 1) {

                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            // Print second star except first row
            if (i > 1) {

                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        hollowDiamond(4);
    }
}
