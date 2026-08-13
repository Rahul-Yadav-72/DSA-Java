// clear last ith bit .

public class ClearLastIthBit {
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15,2));
    }
    public static int clearLastIthBit(int num, int i){
        int bitMask = ((-1)<<i);
        return num & bitMask;
    }
}
