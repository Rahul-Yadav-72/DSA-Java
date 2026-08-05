// Create a program to find number of occurrences of an element in an array.

public class QC41 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,4,2};
        System.out.println(find(nums,4));
    }
    public static int find(int[] nums, int key){
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == key){
                count++;
            }
        }
        return count;
    }
}
