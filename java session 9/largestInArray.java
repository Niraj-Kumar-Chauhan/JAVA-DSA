// import java.util.*;
// public class largestInArray {
//     public static void largest_num(int arr[]){
//         int largest = arr[0];
//         for(int i = 0; i<arr.length; i++){
//             if(largest<arr[i]){
//                 largest = arr[i];
//             }
//         }
//         System.out.println("Largest Number In Array Is : " + largest);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num[] = {1,7,6,31,5};
//         largest_num(num);
//     }
// }


import java.util.*;
public class largestInArray {
    public static int largest_num(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = {1,7,6,31,5,45};
        System.out.println("Largest Number In Array Is : " + largest_num(num));
        
    }
}