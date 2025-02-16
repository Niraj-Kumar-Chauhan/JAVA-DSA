import java.util.*;
public class maxSum_of_subarrays_kadanes_algorithm{
    public static int kadanes(int number[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
           curSum = curSum + number[i];
           if(curSum < 0){
            curSum = 0;
           }
           if(maxSum < curSum){
            maxSum = curSum;
           }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        int maxSumNum = kadanes(arr);
        System.out.println("Maximum sum of subarrays = " + maxSumNum);
    }
}