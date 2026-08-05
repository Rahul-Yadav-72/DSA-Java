//Create a program to merge two sorted arrays
public class CQ47 {
    public static void main(String[] args) {
        int[] nums1 = {1,5,8,9,14};
        int[] nums2 = {2,3,7,10,18};
        int[] ans = twoSortedArr(nums1,nums2);
        printArr(ans);

    }
    public static void printArr(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int[] twoSortedArr(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j] ){
                ans[k] = nums1[i];
                i++;
            }else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        // Remaining elements of nums1
        while (i < nums1.length) {
            ans[k] = nums1[i];
            i++;
            k++;
        }

        // Remaining elements of nums2
        while (j < nums2.length) {
            ans[k] = nums2[j];
            j++;
            k++;
        }


        return ans;
    }
}
