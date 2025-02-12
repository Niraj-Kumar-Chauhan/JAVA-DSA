import java.util.*;
public class palindromic_pattern {
    public static void palindrom(int n){
        for(int i = 1; i<=n; i++){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        palindrom(n);
    }
}
