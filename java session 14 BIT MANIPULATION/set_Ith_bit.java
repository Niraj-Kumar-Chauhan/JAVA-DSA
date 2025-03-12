import java.util.*;
public class set_Ith_bit {
    public static int SetIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter Ith position to set bit : ");
        int i = sc.nextInt();
        System.out.println(SetIthBit(num, i));
    }
}
