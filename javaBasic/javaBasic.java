// public class javaBasic {
//    public static void main(String args[]){
//          System.out.println("Hello Niraj\n");
//          System.out.println("Hello World");     // '\n' or println -----> for line space  
//          System.out.println("Hello World");
//          System.out.println("Hello World");
//    }
// }

//Type conversion
// import java.util.*;
// public class javaBasic{
//     public static void main(String args[]){
        // int a = 45;
        // float b = a;   // type conversion which java accept it
        // System.out.println(b);
        
        // float a = 34f;
        // int b = a;        // lossy conversion which java not accept it
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat();         // this is wrong conversion
//     }
// }

// Type casting or narrowing conversion
// import java.util.*;
// public class javaBasic{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
                
//                 float a = 99.99f;
//                 int b = (int)a;         // that is a type casting or narrowing conversion
//                 System.out.println(b);

//                 int a = 45;
//                 float b = a;
//                 System.out.println(b);
//         }
// }

// import java.util.*;
// public class javaBasic{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);

//                 char a = 'a';
//                 char b = 'b';
//                 System.out.println((int)a);   // output  97
//                 System.out.println((int)b);  // output 98
//                 System.out.println(a);       // output   'a'
//                 System.out.println(b - a);
//         }
// }

// import java.util.*;
// public class javaBasic {

//         public static void main(String args[]){
//                 char c = 'c';
//                 int a = c*2;
//                 System.out.println(a);       // get output 198 which is true

//                 byte b = 21;
//                 byte d = (byte)(b*2);
//                 System.out.println(d);         // get output 42 which is true 
//                 // short  a = 34;
//                 // byte b = 21;
//                 // char c = 'c';

//                 // byte bt = (byte)(a + b + c);  // it is a lossy conversion
//                 // System.out.println(bt);      // this type of conversion will be print but no sence of output
//         }
// }


// import java.util.*;
// public class javaBasic{
//         public static void main(String args[]){
//                 int a = 21;
//                 float b = 32.5f;
//                 long c = 33;
//                 double d = 54;
//                 double ans = a + b + c + d;
//                 System.out.println(ans);
               
//         }
// }

import java.util.*;
public class javaBasic{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                //int num = sc.nextInt();
                int factSum = 0;
                for(int i = 2; i<=3; i++){
                   int fact = 1;
                    for(int j = i; j>=1; j--){
                        fact = fact*j;
                    }
                    factSum = factSum + fact;
                }
                System.out.println("factorial sum of 1 to 5 is : " + factSum );
        }
}
