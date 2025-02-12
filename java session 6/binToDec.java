// import java.util.*;
// public class binToDec {
//     public static void convertBinToDec(int n){
//         int ans = 0;
//         int pow = 1;
//         while(n>0){
//             int i = 1;
//             int rem = n%10;
//             ans = ans + rem*pow;
//             n = n/10;
//             i = 2;
//             pow = pow*i;
//         }
//         System.out.println(ans);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         convertBinToDec(num);
//     }

// }


import java.util.*;
public class binToDec{
    public static void convertBinToDec(int binNum){
        int decNum = 0;
        int pow = 0;
        int myBinNum = binNum;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + lastDigit*(int)Math.pow(2,pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal Number Of " + myBinNum + " = " + decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a binary number : ");
        int n = sc.nextInt();
        convertBinToDec(n);
    }
}