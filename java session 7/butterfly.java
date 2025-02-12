import java.util.*;
public class butterfly {
    public static void butter_fly(int n){
        //1st half
        for(int i = 1; i<=n; i++){
            //stars --- i
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces --- 2(n-i)
            for(int k = 1; k<= 2*(n-i); k++){
                System.out.print("  ");
            }
            //stars --- i
            for(int l = 1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for(int i = n; i>=1; i--){
            //stars --- i
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            // spaces --- 2*(n-i)
            for(int k = 1; k<= 2*(n-i); k++){
                System.out.print("  ");
            }
            //stars --- i
            for(int l = 1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        butter_fly(n);
    }
}
