// Create a program to calculate simple interest .
import java.util.Scanner;

public class CQ12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your principal : ");
        float principal = sc.nextFloat();
        System.out.print("Enter rate of interest : ");
        float rate = sc.nextFloat();
        System.out.print("Enter time : ");
        float time = sc.nextFloat();

        float si = (principal*rate*time)/100;

        System.out.println("Simple interest : "+si);
    }
}
