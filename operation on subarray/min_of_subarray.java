public class min_of_subarray {
    public static int minOfSubarray(int arr[]){
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int curSum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    curSum = curSum + arr[k];
                }
                System.out.print("  ");
                if(minNum > curSum){
                    minNum = curSum;
                }
            }
            System.out.println();
        }
        return minNum;
    }
    public static void main(String args[]){
        int arr[] = {2 , 4 , 6 , -8 , 10};
        int minNo = minOfSubarray(arr);
        System.out.println("Manimum sum of subarray is : " + minNo);
    }
}
