/*import java.util.Arrays;
public class inbuild_sort_in_array {
    public static void ArrayPrint(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5 , 4 , 1 , 3 , 2};
        //Arrays.sort(arr);
        Arrays.sort(arr, 0 , 3);
        ArrayPrint(arr); 
    }
}*/


import java.util.Arrays;
import java.util.Collections;
public class inbuild_sort_in_array {
    public static void ArrayPrint(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer arr[] = {5 , 4 , 1 , 3 , 2};
        //Arrays.sort(arr , Collections.reverseOrder());  // 5 , 4 , 3 , 2 , 1
        Arrays.sort(arr, 0 , 4 , Collections.reverseOrder()); // 5 , 4 , 3 , 1 , 2
        ArrayPrint(arr); 
    }
}

