// Create a program to find the maximum and minimum element in an array.
public class CQ42 {
    public static void main(String[] args) {
        int[] arr = {1,2,30,4,50,6,7,8,90,1,-1};
        findMaxMin(arr);
    }
    public static void findMaxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max value of array : "+ max);
        System.out.println("Min value of array : "+min);
    }
}
