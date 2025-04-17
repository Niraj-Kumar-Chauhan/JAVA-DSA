import java.util.*;
public class All_occurence_index{
    public static void main(String args[]){
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        allOccurenceKey(arr, 0, 2);
    }
    public static void allOccurenceKey(int arr[] , int index, int key){
        int n = arr.length;
        if(index == n){
            return;
        }
        if(arr[index] == key){
            System.out.print(index + " ");
        }
        allOccurenceKey(arr, index+1, key);
    }
}