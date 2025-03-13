import java.util.Scanner;

public class clear_ith_bit {
    public static int ClearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        System.out.print("Enter Ith No. To Clear Ith bit Of A Number : ");
        int i = sc.nextInt();
        System.out.println(ClearIthBit(num , i));
    }
}
