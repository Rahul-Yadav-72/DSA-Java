// create a program to calculate Compound interest .

import java.util.Scanner;
public class CQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        float principal = sc.nextFloat();
        System.out.print("Enter Rate : ");
        float rate = sc.nextFloat();
        System.out.println("Enter Time : ");
        float time = sc.nextFloat();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Total Amount = " + amount);

    }
}
