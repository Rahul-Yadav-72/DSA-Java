//Question 4: Trapping Rain Water
//Problem Statement
//Tumhe ek integer array height diya gaya hai jo ek elevation map ko represent karta hai.
//Har bar ki width = 1 hai.
//Har integer value bar ki height ko represent karti hai.
//Tumhe calculate karna hai ki rain ke baad kitna water trap ho sakta hai.

public class PQ4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapWater(arr));
    }
    public static int trapWater(int[] height){
        int n = height.length;
        //left max array
        int[] left = new int[n];
        left[0] = height[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        //right max array
        int[] right = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2; i>= 0; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        //loop
        int trapWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(left[i],right[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }
}
