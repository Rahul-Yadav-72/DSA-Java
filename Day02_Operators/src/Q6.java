import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number fist number : ");
        int num1 = sc.nextInt();
        System.out.print("enter number fist number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter oprator : ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '*' :
                System.out.println("Mul of number is : " + (num1*num2));
                break;
            case '/' :
                System.out.println("Div of number is : " + (num1/num2));
                break;

            case '-' :
                System.out.println("Sub of number is : " + (num1-num2));
                break;
            case '+' :
                System.out.println("Sum of number is : " + (num1+num2));
                break;

            default:
                System.out.println("Wrong opretor .");
        }

    }
}
