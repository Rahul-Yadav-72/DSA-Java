// create a program to convert fahrenheit to celsius


import java.util.Scanner;
public class CQ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp fahrenheit : ");
        float temp = sc.nextFloat();

        float cel = (temp-32)*(5.0f/9);

        System.out.println("Celsius : "+ cel);

    }
}
