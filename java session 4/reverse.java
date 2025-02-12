// import java.util.*;
// public class reverseOfNum{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = 10899;

//         int a,b,c,d,e,f,g,h,i,j,k,l,m,n;
//         a = num%10;
//         b = num/10;
//         c = a;
//         d = b % 10;
//         e = b/10;
//         f = d;
//         g = e % 10;
//         h = e/10;
//         i = g;
//         j = h%10;
//         k = h/10;
//         l = j;
//         m = k%10;
//         n = m;
//         int reverse = c*10000 + f*1000 + i*100 + l*10 + n*1;
//         System.out.println(reverse);

//     }
// }

import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while(num > 0){
            int rem = num % 10;
            reverse = reverse*10 + rem;
            num = num / 10;
        }
        System.out.println("reverse is = " + reverse);
    }
}

