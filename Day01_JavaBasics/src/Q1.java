import java.util.Scanner;

// Sum of two number .
public class Q1 {
    public static  void main(String [] args){
//        int a = 12 , b = 23;
//        System.out.println("Sum of a and b is "+(a+b));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int  num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Sum of Num1 and Num2 : "+(num1+num2));
    }

}
