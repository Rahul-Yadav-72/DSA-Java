// Create a program to reverse an array .

public class CQ46 {
    public static void main(String[] args) {
        int[] nums = {10,23,56,43,24,24,64,3};
        printArr(nums);
        reverse(nums);
        printArr(nums);
    }
    public static void printArr(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] nums){
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
