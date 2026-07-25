//Write a program that reads a set of integers and then prints the sum of the even and odd integers.
import java.util.Scanner;
public class PQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int num = sc.nextInt();
        int even = 0, odd = 0;
        for(int i=1; num >= i; i++){
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if(n % 2 == 0){
                even += n;
            }else {
                odd += n;
            }
        }
        System.out.println("Even number Sum : "+even);
        System.out.println("Odd number Sum : "+ odd);
    }
}
