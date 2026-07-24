// Create a program to reverse the digits of a number .
import java.util.*;
public class CQ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int rev = 0;
        while (num > 0){
            int d = num % 10;
            rev = rev*10 + d;
            num /= 10;
        }
        System.out.println("Reverse Number : "+rev);
    }
}
