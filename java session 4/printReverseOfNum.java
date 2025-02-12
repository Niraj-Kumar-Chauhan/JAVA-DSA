import java.util.*;
public class printReverseOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("reverse is : ");
        while(num > 0){
            int rem = num% 10;
            System.out.print(rem);
            num /= 10;
        }
    }
}
