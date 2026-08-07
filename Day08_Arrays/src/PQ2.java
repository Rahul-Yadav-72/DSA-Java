// Question 2: Search in Rotated Sorted Array
//Problem Statement
//Ek integer array nums diya gaya hai jo ascending order mein sorted tha aur uske saare elements unique (distinct) hain.
//Function ko pass karne se pehle, array ko kisi unknown pivot index par rotate kiya gaya ho sakta hai.


public class PQ2 {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(search(arr,1));
    }
    public static int search(int[] arr, int key){
        int start =0;
        int end = arr.length-1;
        //{4,5,6,7,1,2,3}
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if(arr[start] <= key && key <= arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid] >= key && key >= arr[end]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
