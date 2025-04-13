// public class Last_occur_of_an_element {
//     public static void main(String args[]){
//         int arr[] = {5, 6, 8, 3, 1, 9, 3, 23, 6};
//         int i = arr.length-1;
//         System.out.println(lastOccurKey(arr, i, 3));
//     }
//     public static int lastOccurKey(int arr[], int i, int key){
//         if(i == -1){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return lastOccurKey(arr, i-1, key);
//     }
// }



public class Last_occur_of_an_element {
    public static void main(String args[]){
        int arr[] = {5, 6, 8, 3, 1, 9, 3, 23, 6};
        System.out.println(lastOccurKey(arr, 0, 6));
    }
    public static int lastOccurKey(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurKey(arr, i+1, key);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        System.out.println("isFound " + isFound);
        return isFound;
    }
}