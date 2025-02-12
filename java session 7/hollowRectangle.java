// import java.util.*;
// public class hollowRectangle{
//     public static void hollow_Rectangle(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n+1; j++){
//                 if(i == 1 || i == n){
//                     System.out.print("* ");
//                 }else if(j == 1 || j == n+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//          System.out.print("enter a number : ");
//          int n = sc.nextInt();
//          hollow_Rectangle(n);
//     }
// }

import java.util.*;
public class hollowRectangle{
    public static void hollow_Rectangle(int totRow , int totColumn){
        for(int i = 1; i<=totRow; i++){
            for(int j = 1; j<=totColumn; j++){
                if(i == 1 || i == totRow || j == 1 || j == totColumn){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter rows number : ");
         int totRow = sc.nextInt();
         System.out.print("enter columns number : ");
         int totColumn = sc.nextInt();
         hollow_Rectangle(totRow , totColumn);
    }
}
