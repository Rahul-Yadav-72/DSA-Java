// Pattern
//* * * * *
//*       *
//*       *
//* * * * *
public class Q6 {
    public static void hollowRect(int tolRow, int tolCol){
        for(int i=1; i<=tolRow; i++){
            for(int j=1; j<=tolCol ; j++){
                if(i==1 || i==tolRow || j==1 || j==tolCol){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRect(4,5);
    }
}
