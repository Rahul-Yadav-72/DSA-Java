//Question 5: 3Sum
//Problem Statement
//Tumhe ek integer array nums diya gaya hai.
//Tumhe saare unique triplets find karne hain:
//[nums[i], nums[j], nums[k]]
//jinke liye:
//nums[i] + nums[j] + nums[k] == 0
//Conditions:
//i, j, aur k alag-alag indices hone chahiye.
//Answer mein duplicate triplets nahi hone chahiye.

import java.util.Arrays;
public class PQ5 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
    public static void threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // duplicate skip
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    System.out.println(
                            "[" + nums[i] + ", " + nums[left] + ", " + nums[right] + "]"
                    );
                    // duplicate skip
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }
}
