public class triplet_sum_of_num_zero {
    public static void tripletNum(int arr[]){
        int n = arr.length;
        for(int i = 0; i<1; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("( " + arr[i] + " , " + arr[j] + " , " +arr[k] + " )");
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int nums[] = {-1, 0,  1, 2, -1, -4};
        tripletNum(nums);
    }
}
