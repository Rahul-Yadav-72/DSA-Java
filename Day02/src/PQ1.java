// Question 1
//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class PQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is Positive .");
        }else if(num == 0){
            System.out.println("Number is Zero .");
        }else {
            System.out.println("Number is Negative .");
        }
    }
}
