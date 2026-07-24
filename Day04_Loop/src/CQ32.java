// Create a program to find the least common multiple (lcm) of two numbers.
import java.util.Scanner;
public class CQ32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int sm = (num1 < num2) ? num1 : num2;
        int i=2;
        int hcf = 1;
        while(sm >= i){
            if((num1 % i == 0) && (num2 % i == 0)){
                hcf = i;
            }
            i++;
        }
        int lcm = (num1*num2) / hcf;
        System.out.println("Lcm : "+lcm);
        System.out.println("Hcf : "+hcf);
    }
}
