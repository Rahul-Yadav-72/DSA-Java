// Question 3: Best Time to Buy and Sell Stock
//Problem Statement
//Tumhe ek integer array prices diya gaya hai jisme:
//prices[i] = i-th day par stock ka price.
//Tumhe maximum profit find karna hai jo tum ek hi transaction se achieve kar sakte ho.
//Transaction ka matlab:
//Pehle stock buy karna hai.
//Uske baad kisi future day par stock sell karna hai.
//Agar koi profit possible nahi hai, to return 0.

public class PQ3 {
    public static void main(String[] args) {
        int[] arr = {7,1, 5, 3, 6, 4};
        System.out.println(bestTime(arr));
    }
    public static int bestTime(int[] arr){
        int bp = arr[0];
        int maxp = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < bp){
                bp = arr[i];
            }else {
                int profit = arr[i] - bp;
                maxp = Math.max(maxp,profit);
            }

        }
        return maxp;
    }
}
