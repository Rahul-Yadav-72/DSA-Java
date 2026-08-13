// Fast Exponentation
public class FastExponentiation {
    public static void main(String[] args) {

        System.out.println(fastExp(2,4));
    }

    public static int fastExp(int num,int pow){
        int ans =1;
        while (pow > 0){
            if((pow&1) != 0){
                ans = ans*num;
            }
            num = num  * num;
            pow = pow >> 1;

        }
        return ans;
    }
}
