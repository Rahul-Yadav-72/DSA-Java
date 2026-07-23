// Swap two number
public class CQ7 {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        System.out.println("A : "+a+" B : "+b);

         a = a + b;
         b = a - b;
         a = a - b;
//        int c = a;
//        a = b;
//        b = c;
        System.out.println("A : "+a+" B : "+b);
    }
}
