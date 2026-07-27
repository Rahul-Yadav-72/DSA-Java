// Pattern Inverted Pyramid
//*********
// *******
//  *****
//   ***
//    *
public class Q8 {
    public static void main(String[] args) {
        invertedPyramid(5);
    }
    public static void invertedPyramid(int n){
        for (int i=n; i>=1; i--){
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
