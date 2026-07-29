// Reverse an Array {2,4,6,8,10}


public class Q4_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        reverseArray(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int ends = arr[end];
            arr[end] = arr[start];
            arr[start] = ends;
            start++;
            end--;

        }
    }
}
