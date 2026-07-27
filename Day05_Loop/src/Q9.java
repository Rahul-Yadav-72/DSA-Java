//Pattern
//1
//01
//101
//0101
//10101

public class Q9 {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //pattern(5);
//        int[] arr = {1,0,1,1,0,0,1};
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//
//            }
//        }
    }


}
