import java.util.*;
public class floyds_Triangle{
    public static void floydTriangle(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        floydTriangle(n);
     }
}