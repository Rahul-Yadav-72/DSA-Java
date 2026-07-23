// Create a program that show bitwise OR of two numbers
import java.util.Scanner;
public class CQ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int or = num1 | num2;
        System.out.println("bitwise OR : "+or);

    }
}
