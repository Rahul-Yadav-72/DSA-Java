// Create a program that categorize a person into different age groups Child -> below 13 Teen -> below 20
// Adult -> below 60 Senior -> above 60
import java.util.Scanner;

public class CQ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age < 0){
            System.out.println("Invalid age .");
        }else if(age >= 60){
            System.out.println("Senior");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teen");
        }else {
            System.out.println("Child");
        }
    }
}
