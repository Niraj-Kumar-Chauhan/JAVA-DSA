// import java.util.*;
// public class n_power_of_x{
//     public static void main(String args[]){
//         System.out.println(powerOf(4, 5));
//     }
//     public static int powerOf(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         // int fnm1 = powerOf(x , n-1);
//         // return x * fnm1;
//         // or
//         return x * powerOf(x, n-1);
//     }
// }

//optimize code
import java.util.*;
public class n_power_of_x{
    public static void main(String args[]){
        System.out.println(powerOf(4, 5));
    }
    public static int powerOf(int x , int n){
        if(n == 0){
            return 1;
        }
        System.out.println("hello baby");
        int powerhalf = powerOf(x, n/2);
        int powerSq = powerhalf*powerhalf;
        System.out.println(powerSq);
        if(n%2 != 0){
            powerSq = x*powerSq;
        }
        System.out.println(powerSq);
        System.out.println("hello");
        return powerSq;
    }
}