// Pattern
//    *****
//   *   *
//  *   *
// *   *
//*****

public class Q3 {
    public static void main(String[] args) {
        hollRohombus(5);
    }
    public static void hollRohombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                if(j==1 || i==1 || j==n || i==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
