import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mask : ");
        int marks = sc.nextInt();

       String rep =  marks>=33 ? "Pass" : "Fail" ;
        System.out.println(rep);
    }
}
