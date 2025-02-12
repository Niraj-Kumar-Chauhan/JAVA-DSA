// import java.util.*;
// public class invertedHalf_pyramidWithNum {
//     public static void inverte_half_pyramid_with_number(int n){
//         // int count = n;
//         for(int i = 0; i<=n; i++){
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         inverte_half_pyramid_with_number(n);
//     }
// }


// import java.util.*;
// public class invertedHalf_pyramidWithNum {
//     public static void inverte_half_pyramid_with_number(int n){
//         int count = 0;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j <= n-count; j++){
//                 System.out.print("(" + i + "," + j + ") ");
//             }
//             count++;
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         inverte_half_pyramid_with_number(n);
//     }
// }


import java.util.*;
public class invertedHalf_pyramidWithNum {
    public static void inverte_half_pyramid_with_number(int n){
        // int count = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        inverte_half_pyramid_with_number(n);
    }
}