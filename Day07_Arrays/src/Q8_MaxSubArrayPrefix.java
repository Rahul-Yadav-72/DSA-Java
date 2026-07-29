public class Q8_MaxSubArrayPrefix {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        System.out.print(prefix(arr));

    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int prefix(int[] arr){
        int[] newArr = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int curr = 0;
        newArr[0] = arr[0];
        for(int i=1; i<newArr.length; i++){
            newArr[i] = arr[i-1] = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                curr = i==0 ? newArr[j] : newArr[j] - newArr[i-1];
                if(max < curr){
                    max = curr;
                }
            }
        }

        return max;
    }
}
