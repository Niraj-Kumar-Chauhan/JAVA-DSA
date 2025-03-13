import java.util.*;

public class update_ith_bit {
    public static int ClearIthBit(int n , int i){
        int bitMast = ~(1<<i);
        return n & bitMast;
    }
    public static int SetIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int updateIthBit(int n , int i , int bit){
        if(bit == 1){
            return SetIthBit(n, i);
        }else{
            return n;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        System.out.print("Enter Ith No. To  Clear Bit at Ith Position : ");
        int i = sc.nextInt();
        System.out.print("Enter 1 For Update Or 0 For Clear : ");
        int bit = sc.nextInt();
        
        System.out.println(updateIthBit(num, i, bit));
    }
}



// import java.util.*;

// public class update_ith_bit {
//     public static int ClearIthBit(int n , int i){
//         int bitMast = ~(1<<i);
//         return n & bitMast;
//     }
//     public static int updateIthBit(int n , int i , int bit){
//         n = ClearIthBit(n, i);
//         int bitMask = bit<<i;
//         return n | bitMask;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number : ");
//         int num = sc.nextInt();
//         System.out.print("Enter Ith No. To  Clear Bit at Ith Position : ");
//         int i = sc.nextInt();
//         System.out.print("Enter 1 For Update Or 0 For Clear : ");
//         int bit = sc.nextInt();
        
//         System.out.println(updateIthBit(num, i, bit));
//     }
// }