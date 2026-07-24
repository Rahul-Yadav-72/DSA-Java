// Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;
public class CQ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int d = num % 10;
            sum += d;
            num /=10;
        }
        System.out.println("Sum of the digits  : " + sum);
    }
}
