// pair in an array {2,4,6,8,10}

public class Q5_PairArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printPair(arr);
    }
    public static void printPair(int[] arr){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }

        }
        int totalPair = (arr.length *(arr.length-1))/2;
        System.out.println("\ntotal number of pair : "+totalPair);
    }
}
