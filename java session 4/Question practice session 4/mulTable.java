//Question4: Write a program to print the multiplication table of a number N,entered by the
// user.
import java.util.*;
public class mulTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int mul;
        for(int i = 1; i<=10; i++){
            mul = num*i;
            System.out.println(mul);
        }
    }
}
