// Create a program to verify if a number is a palindrome.
import java.util.Scanner;
public class CQ38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int cnum = num;
        int rev = 0;
        while(num > 0){
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        if(cnum == rev){
            System.out.println("Number is palindrome.");
        }else{
            System.out.println("Number is not palindrome.");
        }
    }
}
