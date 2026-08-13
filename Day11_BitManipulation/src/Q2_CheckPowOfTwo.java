// Check if a number is a power of 2 or not.
// n & (n-1) == 0 to power hai nahi to nahi haii.
public class Q2_CheckPowOfTwo {
    public static void main(String[] args) {
        check(2);
    }
    public static boolean checkPowOfTwo(int num){
        return (num & (num -1)) == 0;
    }
    public static void check(int num){
        if(num >0 &&(num&(num-1)) == 0){
            System.out.println("Number is power of two.");
        }else {
            System.out.println("Number is not power of two.");
        }
    }
}
