// get ith bit

public class Get_ithBit {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        System.out.println(getIthBit(num,i));
    }
    public static int getIthBit(int num, int i){
        int bitMask = (1<<i);
        if((num & bitMask) !=0){
            return 1;
        }else{
            return 0;
        }
    }
}
