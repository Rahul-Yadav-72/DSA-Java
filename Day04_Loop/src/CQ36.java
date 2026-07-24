//Create a program to print the fibonacci series up to a certain number .
import java.util.Scanner;
public class CQ36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int a = 0 , b = 1 ;
        while(a <= num){
            System.out.print(a + ", ");
            int c = a +b;
            a=b;
            b=c;
        }

// Print first N terms

//        if(num < 0){
//            System.out.println("Not posible .");
//        }else if(num == 1){
//            System.out.println(a);
//        }else if(num == 2){
//            System.out.println(a+" , "+b);
//        }else {
//            System.out.print(a+" , "+b);
//            int i = 3;
//            while (num >= i){
//                int c = a + b;
//                System.out.print(" , "+c);
//                a=b;
//                b=c;
//                i++;
//
//            }
//        }

    }
}
