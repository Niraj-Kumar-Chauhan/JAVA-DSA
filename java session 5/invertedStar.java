// import java.util.*;
// public class invertedStar {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         for(int line = n; line>=1; line--){
//             for(int star = 1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.*;
public class invertedStar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for(int line = 1; line<=n; line++){
            for(int star = 1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}