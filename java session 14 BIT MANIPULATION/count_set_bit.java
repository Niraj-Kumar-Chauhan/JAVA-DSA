import java.util.*;
public class count_set_bit {
    public static int countSetBit(int n){
        int count = 0;
        while (n>0) {
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1; 
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        System.out.println(countSetBit(num));
    }
}
