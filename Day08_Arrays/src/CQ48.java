// Create a program to search an element in a 2D array.

public class CQ48 {
    public static void main(String[] args) {

        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int key = 18;
        System.out.println(seacrch(nums,key));
    }
    public static boolean seacrch(int[][] nums, int key){

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }
}
