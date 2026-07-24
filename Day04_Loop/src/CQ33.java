// Create a program to find the Greatest Common Divisor (GCD) of two numbers.
import java.util.Scanner;
public class CQ33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int sm = num1 < num2 ? num1:num2;
        int gcd = 1 , i=1;
        while (sm >= i){
            if((num1 % i ==0) && (num2 % i ==0)){
                gcd = i;
            }
            i++;
        }
        System.out.println("GCD : "+gcd);
    }
}
