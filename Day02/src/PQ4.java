import java.util.Scanner;

// Question 5
//Write a Java program to check whether a year is a leap year.
public class PQ4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("This year is Leap year .");
        } else {
            System.out.println("This year is not Leap year .");
        }


    }
}
