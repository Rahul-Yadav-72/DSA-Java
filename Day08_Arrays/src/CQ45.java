// Create a program to reverse an array .
public class CQ45 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,67,4,0};
        reverseArr(arr);
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArr(int[] nums){
        int start =0;
        int end = nums.length-1;
        while (start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            end--;
            start++;
        }
    }
}
