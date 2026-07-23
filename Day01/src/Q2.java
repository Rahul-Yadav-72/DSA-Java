// product of two number user input .

import java.util.Scanner;

public class Q2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Product of first and second number : "+num1*num2);
    }
}
