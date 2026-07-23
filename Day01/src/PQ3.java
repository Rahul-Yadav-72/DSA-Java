import java.util.Scanner;

// Question 3: Write a program to enter the cost of 3 items from the user (using the float data type): a pencil, a pen, and an eraser. Display the total cost of the items as the bill.
//Advanced: Add 18% GST to the total bill and display the final amount.
public class PQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pencil cost : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter pen cost : ");
        float pen = sc.nextFloat();
        System.out.print("Enter eraser cost : ");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("Total cost of 3 item is "+(total));

        System.out.println("===========================================================================================");
        System.out.println("Add 18% GST bill is "+(total+(total*0.18f)));

    }
}
