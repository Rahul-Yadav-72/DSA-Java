// create a program to check if the given array is sorted .

public class CQ43 {
    public static void main(String[] args) {
        int[] arr = {7,6,3,1,5};
        System.out.println(checkSorted(arr));
    }
    public static boolean checkSorted(int[] nums) {
        boolean as = true;
        boolean ds = true;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] > nums[i]){
                as = false;
            }
            if(nums[i-1] < nums[i]){
                ds = false;
            }
        }
        return as || ds;
    }
}
