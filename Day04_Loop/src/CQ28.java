// Devfelop a program that print the multiplication table for a given number .

import java.util.Scanner;
public class CQ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int i=1;
        while(i <= 10){
            System.out.println(num+" * "+i+" = "+(i*num));
            i++;
        }

    }
}
