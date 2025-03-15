import java.util.*;
public class clear_last_ith_bit {
    public static int ClearLastIthBit(int n , int i){
        int bitMask = ((-1)<<i);
        return n & bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number : ");
        int num = sc.nextInt();
        System.out.print("Enter Ith No. To Clear Ith Last Bit : ");
        int i = sc.nextInt();
        System.out.println(ClearLastIthBit(num, i));
    }
}
























