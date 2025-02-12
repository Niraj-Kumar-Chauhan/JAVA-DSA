// import java.util.*;
// public class primeOrNot {
//     public static boolean isPrime(int num){
//         if(num == 2){
//             return true;
//         }
//         for(int i = 2; i<num; i++){
//             if(num % i == 0){
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         boolean ans = isPrime(n);
//         if(ans == true){
//             System.out.println(n + " is prime number.");
//         }else{
//             System.out.println(n + " is not prime number.");
//         }
//     }
// }



import java.util.*;
public class primeOrNot {
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if(ans == true){
            System.out.println(n + " is prime number.");
        }else{
            System.out.println(n + " is not prime number.");
        }
    }
}
