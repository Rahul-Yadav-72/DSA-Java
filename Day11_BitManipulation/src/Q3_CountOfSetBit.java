// Count of set Bits in a number .
public class Q3_CountOfSetBit {
    public static void main(String[] args) {

        System.out.println(countOfSetBit(10));
    }
    public static int countOfSetBit(int num){
        int count = 0;
        while(num > 0){
            if((num&1) != 0){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
}
