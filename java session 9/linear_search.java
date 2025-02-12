//Linear Search
// import java.util.*;
// public class linear_search {
//     public static void linearSearch(int num[], int n){
//         for(int i = 0; i<num.length; i++){
//             if(num[i] == n){
//                 System.out.println("The Index Of Element Is : " + i);
//                 break;
//             }else if(i == num.length - 1){
//                 System.out.println("Not Match Element In Array!");
//                 break;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int num[] = {2,4,6,8,10,12,14,16};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a key Number for searching : ");
//         int n = sc.nextInt();
//         linearSearch(num , n);
//     }
// }

//Linear Search
import java.util.*;
public class linear_search {
    public static int linearSearch(int num[], int n){
        for(int i = 0; i<num.length; i++){
            if(num[i] == n){
                return i;
            }
        } 
        return -1;  
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a key Number for searching : ");
        int n = sc.nextInt();
        int index = linearSearch(num , n);
        if(index == -1){
            System.out.println("Not Match Element In Array!");
        }else{
            System.out.println("The Index Of Element Is : " + index);
        }
    }
}