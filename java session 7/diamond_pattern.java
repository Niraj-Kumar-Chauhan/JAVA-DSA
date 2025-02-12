import java.util.*;
public class diamond_pattern {
    public static void Diamond(int n){
        // outer loop
        //first half
        for(int i = 1;  i<=n; i++){
            //spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print("  ");
            }
            //stars
            for(int k = 1; k<=(i*2)-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half loop
        for(int i = n;  i>=1; i--){
            //spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print("  ");
            }
            //stars
            for(int k = 1; k<=(i*2)-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        Diamond(n);
    }
}
