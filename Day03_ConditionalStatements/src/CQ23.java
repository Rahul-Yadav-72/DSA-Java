// Create a program that shows bitwise XOR of two number .
import java.util.Scanner;
public class CQ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int xor = num1 ^ num2;
        System.out.println("bitwise OR : "+xor);
    }
}
