import java.util.*;
public class sumOfFirstN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count = 1;
        int sum = 0;
        
        while(count <= range){
            sum = sum + count;
            count++;
        }
        System.out.println("sum of first " + range + " natural number is " + sum);
    }
}
