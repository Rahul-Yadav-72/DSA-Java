// Create a program that shows bitwise AND of two number .

import java.util.Scanner;

public class CQ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter secon number : ");
        int num2 = sc.nextInt();

        int sum = num1 & num2;
        System.out.println("Bitwise AND : " + sum);
    }
}
