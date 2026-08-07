// Spiral matrix .

public class Q1_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        spiralMatrix(matrix);
    }
    public static void spiralMatrix(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i=startCol; i<=endCol ; i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //right
            for(int i=startRow+1; i<= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //down
            for(int i=endCol-1; i>=startCol; i--){
                if(endRow == startRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
}
