import java.util.*;
public class printPrimeNo {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i) == true){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter Range No. : ");
        int n = sc.nextInt();
        printPrime(n);
    }
}
