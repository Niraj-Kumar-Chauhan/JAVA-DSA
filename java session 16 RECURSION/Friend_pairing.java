// public class Friend_pairing {
//     public static void main(String args[]){
//         System.out.println(friendPairing(5));
//     }
//     public static int friendPairing(int n){
//         if(n == 1 || n == 2){
//             return n;
//         }
//         //single
//         System.out.println("n-1");
//         int fnm1 = friendPairing(n-1);
//         //pairing ways
//         System.out.println("n-2");
//         int fnm2 = friendPairing(n-2);
//         System.out.println("ways");
//         int totWays = fnm1 + (n-1)*fnm2;
//         System.out.println("tot");
//         return totWays;
//     }
// }


//or

public class Friend_pairing {
    public static void main(String args[]){
        System.out.println(friendPairing(5));
    }
    public static int friendPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendPairing(n-1) + (n-1)*friendPairing(n-2);
    }
}