import java.util.*;
public class solid_rhombus {
    public static void solid_Rhombus(int n){
        for(int i = 1; i<=n; i++){
            //spaces --- (n-i)
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars --- n
            for(int k = 1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        solid_Rhombus(n);
    }
}
