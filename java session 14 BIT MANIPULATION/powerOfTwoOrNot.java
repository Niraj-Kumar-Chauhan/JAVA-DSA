// import java.util.*;

// public class powerOfTwoOrNot {
//     public static boolean PowerOfTwo(int n){
//         if((n & (n-1)) == 0){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number : ");
//         int num = sc.nextInt();
//         System.out.println(PowerOfTwo(num));
//     }
// }


import java.util.*;

public class powerOfTwoOrNot {
    public static boolean PowerOfTwo(int n){
        return ((n & (n-1))) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        System.out.println(PowerOfTwo(num));
    }
}
