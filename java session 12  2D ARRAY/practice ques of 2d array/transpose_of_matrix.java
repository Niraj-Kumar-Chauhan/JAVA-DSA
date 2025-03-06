public class transpose_of_matrix {
    public static void printTranspose(int arr[][]){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{5, 3, 9} , {6, 4, 8} };

        int row = 2;
        int col = 3;
        System.out.println("original matrix is : ");
        printTranspose(matrix);
        int transpose[][] = new int[col][row];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("The transpose matrix is : ");
        printTranspose(transpose);
        
    }
}
