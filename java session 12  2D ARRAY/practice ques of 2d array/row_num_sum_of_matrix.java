/*Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18*/

public class row_num_sum_of_matrix {
    public static int sumOfSecondRow(int arr[][]){
        int row = 0;
        int sum = 0;
        while(row < arr.length){
            if(row == 1){
                for(int i = 0; i<arr[0].length; i++){
                    sum += arr[row][i];
                }
                return sum;
            }
            row++;
        }
        return 0;
    }
    public static void main(String args[]){
        int matrix[][] = { { 1, 4, 9} , {11, 4, 3} , {2, 2, 3} };
        int rowSum = sumOfSecondRow(matrix);
        System.out.println("sum of second row elements is " + rowSum);
    }
}
