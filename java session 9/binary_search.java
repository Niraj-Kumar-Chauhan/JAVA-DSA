// import java.util.*;
// public class binary_search {
//     public static int bin_search(int arr[], int key){
//         int start = 0, end = arr.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]>key){
//                 end = mid-1;
//             }else if(arr[mid]<key){
//                 start = mid+1;
//             }else{
//                 return mid;  
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int number[] = {2,4,6,8,10,12,14,16};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a key number : ");
//         int n = sc.nextInt();
//         int result = bin_search(number,n);
//         if(result == -1){
//             System.out.println("the key number is not found");
//         }else{
//             System.out.println("Index number of key number is : " + result);
//         }
//     }
// }


import java.util.*;
public class binary_search {
    public static int bin_search(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a key number : ");
        int n = sc.nextInt();
        int result = bin_search(number,n);
        if(result == -1){
            System.out.println("the key number is not found!");
        }else{
            System.out.println("Index number of key number is : " + result);
        }
    }
}