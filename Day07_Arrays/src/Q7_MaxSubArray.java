//Max sub Array {1,-2,6,-1,3}

public class Q7_MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        System.out.println("MAX : "+maxSubArr(arr));
    }
    public static int maxSubArr(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++){
            for (int j=i; j<arr.length; j++){
                int curr = 0;
                for(int k=i; k<=j; k++){
                    curr += arr[k];
                    if(max < curr){
                        max = curr;
                    }
                    System.out.println(curr);
                }


            }
        }
        return max;
    }
}
