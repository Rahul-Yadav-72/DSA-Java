// print subarrys
// a continuous part of array
public class Q6_SubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printsubArray(arr);
    }
    public static void printsubArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("(");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+",");
                }
                System.out.println(")");


            }
            System.out.println();
            int totalSubArr = (arr.length*(arr.length+1))/2;
            System.out.println("total sub arrays : "+totalSubArr);
        }
    }
}
