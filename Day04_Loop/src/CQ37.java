//Create a program to check if a number is an Armstrong number .
import java.util.Scanner;
public class CQ37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int cnum = num;
        int sum = 0;
        while (num > 0){
            int d = num % 10 ;
            sum = sum + (d*d*d);
            num /= 10;

        }
        if(cnum == sum){
            System.out.println("This number is Armstrong .");
        }else{
            System.out.println("This number is not Armstrong .");
        }
    }
}
