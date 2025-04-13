public class Occurence_of_an_elment {
    public static void main(String args[]){
        int arr[] = {2, 7, 3, 4, 7, 9, 4, 2, 6};
        System.out.println(occurKey(arr, 5, 0));
    }
    public static int occurKey(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return occurKey(arr, key, i+1);
    }
}
