// Set ith bit --> ye kahta hai ki ith bit pe 1 ho ya 0 use 1 karna .

public class Set_ithBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
    public static int setIthBit(int num , int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }
}
