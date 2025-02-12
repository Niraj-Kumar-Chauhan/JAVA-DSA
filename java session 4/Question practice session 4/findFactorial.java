//Question 3 :Write a program to find the factorialof any number entered by the user
import java.util.*;
public class findFactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("factorial of " + num + " is " + fact);
    }
}
