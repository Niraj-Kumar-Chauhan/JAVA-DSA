import java.util.*;
public class max_of_subarray{
    public static int maxOfSubarray(int arr[]){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.print( "  ");
                maxNum = Math.max(sum , maxNum);
            }
            System.out.println();
        }
        return maxNum;
    }
    public static void main(String args[]){
        int arr[] = {2 , 4 , 6 , -8 , 10};
        int maxNo = maxOfSubarray(arr);
        System.out.println("Maximum sum of subarray is : " + maxNo);
    }
}