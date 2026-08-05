// Create a program to find the sum and average of all elements in an array.

public class CQ40 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 10, 5};
        CQ40 obj = new CQ40();
        obj.sumAvg(nums);
    }

    public void sumAvg(int[] num){
        int sum =0;
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        double avg = (sum/2.0d);
        System.out.println("Sum of all element : "+sum);
        System.out.println("Average of all element : "+avg);
    }
}
