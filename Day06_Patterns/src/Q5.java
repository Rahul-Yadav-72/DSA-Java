//Pattern Hollow Rectangle
//*****
//*   *
//*   *
//*   *
//*****
public class Q5 {
    public static void hollowRectangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==1 || j==n || i==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(5);
    }
}
