// Create a program to sum all odd number from 1 to a specified number N.
import java.util.Scanner;
public class CQ29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num  = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(num >= i){
            if(i % 2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum all odd number : "+sum);

    }
}
