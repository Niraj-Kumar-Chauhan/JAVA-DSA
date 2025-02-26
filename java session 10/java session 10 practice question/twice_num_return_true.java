import java.util.*;
public  class twice_num_return_true {

    public static boolean twiceNumTrue(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int nums[] = {1,  3,  4, 1};
        boolean result = twiceNumTrue(nums);
        System.out.println(result);
    }
}