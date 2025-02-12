import java.util.*;
public class largeNumOfTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        if(num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        if(num1 == num2){
            System.out.println(num1 + " = " + num2);
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
