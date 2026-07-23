// Create a program that determines if a number is odd or even .
import java.util.Scanner;

public class CQ16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Given number is even .");
        }else {
            System.out.println("Given number is odd .");
        }
    }
}
