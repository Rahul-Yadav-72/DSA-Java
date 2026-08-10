//SubStirng


public class Q3_SubString {
    public static void main(String[] args) {
        String str = "RahulYadav";
        System.out.println(subString(str,0,6));
    }
    public static String subString(String str , int si , int ei){
        String ans = "";
        for(int i=si; i<ei; i++){
            ans += str.charAt(i);
        }
        return ans;
    }
}
