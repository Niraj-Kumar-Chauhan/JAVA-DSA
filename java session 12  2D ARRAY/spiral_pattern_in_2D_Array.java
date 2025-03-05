public class spiral_pattern_in_2D_Array {
    public static void printSpiralArray(int arr[][]){
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top Array
            for(int j = startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j] + " ");
            }
            //right Array
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol] + " ");
            }
            //bottom Array
            for(int j = endCol-1; j>=startCol; j--){
                // if(startRow == endRow){
                //     break;
                // }
                System.out.print(arr[endRow][j] + " ");
            }
            //left Array
            for(int i = endRow-1; i>=startRow+1; i--){
                // if(startCol == endCol){
                //     break;
                // }
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[]){
        //int Matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        //int Matrix[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int Matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        printSpiralArray(Matrix);
    }
}
