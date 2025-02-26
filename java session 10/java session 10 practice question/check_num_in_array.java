import java.util.*;
public class check_num_in_array {
    public static int checkNumInArray(int arr[] , int num){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int nums[] = {4 , 3 , 23 , 0 , 1 , 17 ,7};
        int result = checkNumInArray(nums, num);
        System.out.println("the index of number " + num + " is : " + result);
    }
}
