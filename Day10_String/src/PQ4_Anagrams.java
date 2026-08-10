public class PQ4_Anagrams {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cbad";
        System.out.println(checkAnagrams(str1,str2));
    }
    public static boolean checkAnagrams(String str1 , String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] st = new int[26];
        for (int i=0; i<str1.length(); i++){
            st[str1.charAt(i) - 'a']++;
        }
        for (int i=0; i<str2.length(); i++){
            st[str2.charAt(i) - 'a']--;
            if(st[str2.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
