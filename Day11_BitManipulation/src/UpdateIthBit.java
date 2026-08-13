// update ith bit
public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateIthbit(10,3,0));
    }
    public static int updateIthbit(int num, int i , int newBit){
//        if(newBit == 0){
//            return clearIthBit(num,i);
//        }else {
//            return setIthBit(num,i);
//        }
        num = clearIthBit(num,i);
        int bitMask = newBit << i;
        return num | newBit;
    }
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }
    public static int setIthBit(int num, int i){
        int bitMask = (1<<i);
        return num | bitMask;
    }
}
