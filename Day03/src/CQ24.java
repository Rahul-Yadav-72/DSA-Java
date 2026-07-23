// Create a program that shows bitwise compliment of a number .
import java.util.Scanner;
public class CQ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int complement = ~num;

        System.out.println("Bitwise Complement: " + complement);
    }
}
