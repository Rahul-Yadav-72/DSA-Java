// Create a program that calculates grades based on marks A-> above 90%  B -> above 75% C -> above 60% D -> 30%
// F -> below 30%
import java.util.Scanner;
public class CQ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}
