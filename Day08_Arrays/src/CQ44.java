// create a program to return a new array deleting a specific element.

public class CQ44 {
    public static void main(String[] args) {
        int[] arr = {12,21,34,24,24,55};
        int[] ans = deletingEle(arr,24);
        printArr(ans);
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[]  deletingEle(int[] nums, int ele){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != ele){
                count++;
            }
        }
        int[] ans = new int[count];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != ele){
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }
}
