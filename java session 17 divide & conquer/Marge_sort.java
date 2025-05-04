import java.util.*;
public class Marge_sort {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si , int ei){
        if(si>=ei){
            System.out.println("si = " + si + "  " + " ei = " + ei);
            return;
        }
        int mid = si + (ei-si)/2;
        System.out.println("si1 = " + si + " ei = " + ei);
        mergeSort(arr, si, mid);
        System.out.println("si2 = " + si + " ei = " + ei);
        mergeSort(arr, mid+1, ei); 
        System.out.println("si3 = " + si + " ei = " + ei);
        merge(arr, si, mid, ei);
    } 
    public static void merge(int arr[], int si , int mid , int ei){
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=ei) {
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 2, 5, 8};
        int n = arr.length-1;
        mergeSort(arr, 0, n);
        printArr(arr);
    }
}