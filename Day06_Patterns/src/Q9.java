// Pattern hollow Pyramid

//    *
//   * *
//  *   *
// *     *
//*********

public class Q9 {
    public static void main(String [] args){
        hollowPyramid(5);
    }
    public static void hollowPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            if(i == n){
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                if(i>1){
                    for(int j=1; j<=(2*i)-3; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }
}
