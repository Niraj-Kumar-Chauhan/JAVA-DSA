import java.util.*;
public class swap_two_num_without_third_variable {
    public static void swapTwoNum(int a , int b){
        a = a + b - a;
        b = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        swapTwoNum(a, b);
    }
}
