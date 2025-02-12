import java.util.*;
public class hollow_rhombus {
    public static void hollow_Rhombus(int n){
        //outer loop
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print("  ");
            }
            // Hollow Rhombus
            for(int k = 1; k<=n; k++){
                if(i == 1 || i==n || k == 1 || k==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        hollow_Rhombus(n);
    }
}
