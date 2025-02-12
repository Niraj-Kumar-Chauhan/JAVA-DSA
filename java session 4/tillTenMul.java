// keep entering numbers till user enters a multiple of 10;
import java.util.*;
public class tillTenMul{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter yor number : ");
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
        System.out.println("welcome to coding...");
    }
}
