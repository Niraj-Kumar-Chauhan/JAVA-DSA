import java.util.*;
public class maxSum_with_prefixSum_of_subarray {
    public static int maxSum_with_prefixSum(int number[]){
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = number[i] + prefix[i-1];
        }
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j = i; j<number.length; j++){
                int end = j;
                int curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxNum < curSum){
                    maxNum = curSum;
                }
            }
        }
        return maxNum;
    }
    public static void main(String args[]){
        int arr[] = {1 , -2 , 6 , -1 , 3};
        int maxNumber = maxSum_with_prefixSum(arr);
        System.out.println("maximum sum of subarray = " + maxNumber);
    }
}
