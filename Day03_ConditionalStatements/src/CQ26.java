// Create a program that shows use of right shift operator
import java.util.Scanner;
public class CQ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int lef = num1 >> num2;
        System.out.println("bitwise OR : "+lef);
    }
}
