// program instead calculates the sum of even and odd numbers from 1 to num
import java.util.*;
public class PQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int i=1;
        int even = 0 , odd = 0;
        while (num >= i){
            if(i % 2 == 0){
                even += i;
            }else {
                odd += i;
            }
            i++;
        }
        System.out.println("Sum of even number is : "+even);
        System.out.println("Sum of odd number is : "+odd);
    }
}
