// import java.util.*;
// public class half_pyramid {
//     public static void inverte_and_rotated_half_pyramid(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<= n;  j++){
//                 if(j<=n-i){
//                     System.out.print("  ");
//                 }else{
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         inverte_and_rotated_half_pyramid(n);
//     }
// }


import java.util.*;
public class half_pyramid {
    public static void inverte_and_rotated_half_pyramid(int n){
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<= n-i;  j++){
                System.out.print(" ");
            }
            //stars
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        inverte_and_rotated_half_pyramid(n);
    }
}