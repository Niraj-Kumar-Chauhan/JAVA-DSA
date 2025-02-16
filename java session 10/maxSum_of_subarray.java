public class maxSum_of_subarray{
    public static int maxOfSubarray(int arr[]){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int curSum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    curSum = curSum + arr[k];
                }
                System.out.print( "  ");
                if(maxNum < curSum){
                    maxNum = curSum;
                }
            }
            System.out.println();
        }
        return maxNum;
    }
    public static void main(String args[]){
        int arr[] = {1 , -2 , -3 , -1 , 3};
        int maxNo = maxOfSubarray(arr);
        System.out.println("Maximum sum of subarray is : " + maxNo);
    }
}