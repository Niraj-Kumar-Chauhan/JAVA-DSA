import java.util.*;
public class get_Ith_bit {
    public static int GetIthBit(int n , int i){
        int bitMask =  1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter Ith position to find bit : ");
        int i = sc.nextInt();
        System.out.println(GetIthBit(num, i));
    }
}
