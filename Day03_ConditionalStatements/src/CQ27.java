// Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;
public class CQ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if((num & 1) == 0){
            System.out.println("Even number.");
        }else{
            System.out.println("Odd number.");
        }
    }
}
