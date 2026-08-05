// Create a program to do sum and avg of all elements in a 2D array.
public class CQ49 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        sumAvg(nums);
    }
    public static void sumAvg(int[][] nums){
        int sum = 0;
        int num = nums.length * nums[0].length;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                sum += nums[i][j];
            }
        }
        float avg = (float) sum/num;
        System.out.println("Sum : "+sum);
        System.out.println("Avg : "+avg);

    }
}
