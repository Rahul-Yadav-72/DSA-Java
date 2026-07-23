
// Create a program to calculate the area of triangle .
import java.util.Scanner;
public class CQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the triangle: ");
        int hight = sc.nextInt();
        System.out.print("Enter base of the triangle: ");
        int base = sc.nextInt();

        float area = 0.5f*hight*base;
        System.out.println("Area of Triangle : "+area);
    }
}
