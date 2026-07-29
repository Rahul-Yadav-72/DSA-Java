// Largest Number
// find the largest number in a given array . {1,2,6,3,5}

public class Q2_LargestNumber {
    public static void main(String[] args) {
        int arr [] ={1,2,6,3,5};
        System.out.println(largestNumber(arr));
    }
    public static int largestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
