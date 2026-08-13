// Swap two numbers without using any third variable
public class PQ2_Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("A: "+a+" B: "+b);
        a = b^a;
        b = b^a;
        a = b^a;
        System.out.println("A: "+a+" B: "+b);
    }
}
