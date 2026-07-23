// Create a program that take numbers and show result of all arithmetic operators .

import java.util.Scanner;

public class CQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number : ");
        int num2 = sc.nextInt();

        System.out.println("Sum : "+(num1+num2));
        System.out.println("Sub : "+(num1-num2));
        System.out.println("Mul : "+(num1*num2));
        System.out.println("Div : "+(num1/num2));
        System.out.println("Mod : "+(num1%num2));

    }
}
