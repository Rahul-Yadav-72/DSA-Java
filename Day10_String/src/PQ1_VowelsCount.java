//Question 1: Count Lowercase Vowels in a String
//Problem:
//Count how many times lowercase vowels (a, e, i, o, u) occur in a string entered by the user.

import java.util.Scanner;
public class PQ1_VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.println(countVowel(str));

    }
    public static int countVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ){
                count++;

            }
        }
        return count;
    }
}
