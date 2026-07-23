// Question 2: Write a program to input the side of a square. You have to output the area of the square.
//Hint: Area of a square = side × side.

import java.util.Scanner;

public class PQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square : ");
        float side = sc.nextFloat();
        System.out.println("Area of the Square : "+(side*side));

    }
}
