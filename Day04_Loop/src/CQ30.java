// Write a function that calculates the factorial of a given number .
import java.util.*;
public class CQ30 {
    public static double factorial(int num){
        int i=1;double fact = 1;
        while(num >= i){
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        double fact = factorial(num);
        System.out.println("Factorial is : "+ fact);

    }
}
