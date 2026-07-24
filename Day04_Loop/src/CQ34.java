// Create a program to check whether a given number is prime.

import java.util.Scanner;
public class CQ34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num <= 1){
            System.out.println("Given number is not prime .");
        }else {
            int i = 2;
            while(num > i){
                if(num % i == 0){
                    System.out.println("Given number is not prime .");
                    break;
                }
                i++;
            }
            if(i==num){
                System.out.println("Given number is prime .");
            }
        }


    }
}
