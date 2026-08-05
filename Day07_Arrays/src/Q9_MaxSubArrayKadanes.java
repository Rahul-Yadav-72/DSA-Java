// Max Sub Array sum Kadane's Algorithm .

public class Q9_MaxSubArrayKadanes {
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kandanes(arr);

    }
    public static void kandanes(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            ms = Math.max(cs,ms);
            if(cs < 0){
                cs =0;
            }

        }
        System.out.println("Max subarrays sum : " + ms);
    }
}
