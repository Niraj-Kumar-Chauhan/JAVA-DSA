import java.util.*;
public class decToBin {
    public static void conDecToBin(int num){
        int binNum = 0;
        int myDecNum = num;
        int lastDigit = 0;
        int pow = 0;
        while(num>0){
            lastDigit = num % 2;
            binNum = (binNum + lastDigit*(int)Math.pow(10,pow));
            num = num/2;
            pow++;
        }
        System.out.println("Binary number of " + myDecNum + " = " + binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Decimal Number : ");
        int n = sc.nextInt();
        conDecToBin(n);
    }
}
