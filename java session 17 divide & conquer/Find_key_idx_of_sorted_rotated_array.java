public class Find_key_idx_of_sorted_rotated_array {
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int n = arr.length-1;
        int index = findKeyIdx(arr, 0, 0, n);
        System.out.println(index);
    }
    public static int findKeyIdx(int arr[] , int tar, int si , int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if(arr[si]<= tar && tar <= arr[mid]){
                return findKeyIdx(arr, tar, si, mid-1);
            }else{
                return findKeyIdx(arr, tar, mid+1, ei);
            }
        }else{
            if(arr[mid]<= tar && tar<= arr[ei]){
                return findKeyIdx(arr, tar, mid+1, ei);
            }
            else{
                return findKeyIdx(arr, tar, si, mid-1);
            }
        }
    }
}
