// Pattern
//A
//B C
//D E F
//G H I J
public class Q5 {
    public static void main(String[] args) {
        Character ch = 'A';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
