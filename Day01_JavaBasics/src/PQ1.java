// Question 1:In a program, input 3 numbers :A,B and C.You have to output the average of these 3 numbers.
//(Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.Scanner;

public class PQ1 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        float Avg = (num1+num2+num3)/3.0f;
        System.out.println("Average of number is " + Avg);
    }
}
