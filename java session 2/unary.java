
// Arithmetic Operators ----> Binary operation
// import java.util.*;
// public class operators{
//     public static void main(String args[]){
//         int A = 10;
//         int B = 5;
//         System.out.println("add = " + (A+B));
//         System.out.println("diffence = " + (A-B));
//         System.out.println("product = " + (A*B));
//         System.out.println("division = " + (A/B));
//         System.out.println("remender = " + (A%B));

//     }
// }



// unary operator

import java.util.*;
public class unary{
    public static void main(String args[]){
        // increment
        int a = 20;
        int b = ++a; // pre increment 
        System.out.println(a);
        System.out.println(b);

        int c = 20;
        int d = c++;     // post increment
        System.out.println(c);
        System.out.println(d);
 
        //decrement
        int e = 32;
        int f = --e; // pre decrement
        System.out.println(e);     // get output 31
        System.out.println(f);     // get output 31

        int g = 32;
        int h = g--;        // post decrement
        System.out.println(g);       // get output 31
        System.out.println(h);       // get output 32

    }
}

