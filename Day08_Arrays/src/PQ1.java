//Question 1: Contains Duplicate (Array)
//Problem Statement
//Given an integer array nums, return true if any value appears at least twice in the array. Return false if every element is distinct.
//In simple words:
//Agar array mein koi bhi element repeat hota hai → return true
//Agar saare elements unique hain → return false

public class PQ1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,21,1};
        System.out.println(containDuplicate(arr));
    }
    public static boolean containDuplicate(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
