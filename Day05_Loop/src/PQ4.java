//Write a program to print the multiplication table of a number N entered by the user .

import java.util.Scanner;
public class PQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(num+" * "+i+" = "+(i*num));
        }
        sc.close();
    }
}
