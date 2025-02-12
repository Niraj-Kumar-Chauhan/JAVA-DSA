import java.util.*;
public class halfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for(int line = 1; line<=n; line++){
            for(int i = 1; i<=line; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
