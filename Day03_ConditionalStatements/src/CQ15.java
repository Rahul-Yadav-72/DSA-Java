//Create a program that determines if a number is positive, negative or zero.
import java.util.Scanner;
public class CQ15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Given number is zero .");
        }else if(num < 0){
            System.out.println("Given number is negative .");
        }else {
            System.out.println("Given number is positive .");
        }
    }
}
