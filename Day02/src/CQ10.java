// Create a program to calculate Perimeter of a rectangle .

import java.util.Scanner;
public class CQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int ber = sc.nextInt();

        int perimeter = 2*(len + ber);

        System.out.println(perimeter);

    }
}
