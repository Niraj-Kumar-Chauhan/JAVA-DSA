import java.util.*;
public class fast_exponentiations {
    public static int FastExponentiations(int a , int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
               ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = " );
        int a = sc.nextInt();
        System.out.print("Enter n = " );
        int n = sc.nextInt();
        System.out.println(FastExponentiations(a, n));
    }
}
