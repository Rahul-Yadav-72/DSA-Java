//pattern Pascal Triangle
//        1
//      1   1
//    1   2   1
//  1   3   3   1
//1   4   6   4   1
public class Q10 {
    public static void main(String[] args) {
        pascalTriangle(5);
    }
    public static void pascalTriangle(int n){
        for (int i=0; i<n; i++){
            for (int j=n-i-1; j>=1; j-- ){
                System.out.print(" ");
            }
            int num = 1;
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num = num*(i-j) / (j+1);
            }
            System.out.println();
        }
    }
}
