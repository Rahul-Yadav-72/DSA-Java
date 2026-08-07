// Search in sorted matrix .
//search for a key in row wise & col wise sorted matrix.

public class Q3_SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int key = 90;
        searchMat(mat,key);
    }
    public static boolean search(int[][] mat, int key){
        int row = 0; int col = mat[0].length-1;
        while (row <= mat.length-1 && col >= 0){
            if(mat[row][col] == key){
                System.out.println("foun key : ("+row+", "+col+")");
                return true;
            }
            if(key > mat[row][col]){
                row++;
            }else {
                col--;
            }
        }
        System.out.println("Not found.");
        return false;
    }
    public static boolean searchMat(int[][] mat, int key){
        int row = mat.length-1;
        int col = 0;
        while (row >= 0 && col <= mat[0].length-1){
            if(mat[row][col] == key){
                System.out.println("Key found : ("+row+","+col+")");
                return true;
            }
            if(mat[row][col] < key){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("not found .");
        return false;
    }
}
