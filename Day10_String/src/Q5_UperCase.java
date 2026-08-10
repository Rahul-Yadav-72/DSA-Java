// for a given String convert each the first letter of each word to uppercase.
public class Q5_UperCase {
    public static void main(String[] args) {
        String str = "i am rahul kumar yadav";
        System.out.println(uperCase(str));
    }
    public static String uperCase(String str){
        StringBuilder sb = new StringBuilder("");
        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
