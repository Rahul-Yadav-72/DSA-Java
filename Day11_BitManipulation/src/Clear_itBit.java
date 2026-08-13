// clear ith bit  --> isme hame ith position ko zero karna hota hai .
public class Clear_itBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,2));
    }
    public static int clearIthBit(int num , int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }
}
