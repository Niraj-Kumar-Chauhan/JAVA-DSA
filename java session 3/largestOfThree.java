import java.util.*;
public class largestOfThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b && a >= c){
            System.out.println("largest number is " + a);
        }else if( b >= c){
           System.out.println("largest number is " + b);
        }else{
            System.out.println("largest number is " + c);
        }
    }
}
