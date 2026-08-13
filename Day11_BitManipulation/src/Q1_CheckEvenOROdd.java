// Check the number is even or odd By BitManipulation
// Aproch LSB even ke liye 0 aur LSB odd le liye 1. (Least Significant Bit)
public class Q1_CheckEvenOROdd{
    public static void main(String[] args) {
        checkEvenOdd(4);
        checkEvenOdd(11);
        checkEvenOdd(100);
    }
    public static void checkEvenOdd(int num){
        int bitMask = 1;
        if((num & bitMask) != 0){
            System.out.println("Odd number .");
        }else{
            System.out.println("Even number .");
        }
    }
}
