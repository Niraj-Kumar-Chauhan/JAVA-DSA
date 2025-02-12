// import java.util.*;
// public class Fnction{
//     public static void printHello(){
//         System.out.println("Namste Duniya...");
//         // System.out.println("Namste Duniya...");
//         // System.out.println("Namste Duniya...");

//     }
//     public static void calculateSum(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum is : " + sum);
//     }
//     public static void calculateSum2(int num1 , int num2){    // parameters or formal paramerter
//         int sum = num1 + num2;
//         System.out.println("sum is : " + sum);
//     }
//     public static int calculateSum3(int num1 , int num2){
//         int sum = num1 + num2;
//         return sum;
//     }
//     public static void main(String args[]){
//          //printHello();


//          //calculateSum();


//         //  Scanner sc = new Scanner(System.in);
//         //  int a = sc.nextInt();
//         //  int b = sc.nextInt();
//         //  calculateSum2(a,b);           // actual parameter or arguments
        

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum3(a,b);
//         System.out.println("sum is : " + sum); 
//     }
// }


// java always call by value.
// import java.util.*;
// public class Function{
//     public static void swap(int a, int b){
//         //swap ---> value exchange
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.print("after swap : ");
//         System.out.print("a = " + a + "  ");
//         System.out.print("b = " + b);
//     }
//     public static void main(String args[]){
//         int a = 4;
//         int b = 34;
//         System.out.print("before swap : ");
//         System.out.print("a = " + a + "  ");
//         System.out.print("b = " + b);
//         System.out.println();
//         swap(a,b);
//     }
// }


// find product of two numbers
// import java.util.*;
// public class Function{
//     public static int multiply(int a , int b){
//         int product = a*b;
//         return product;
//     }
//     public static void main(String args[]){
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("enter first number : ");
//         int a = sc.nextInt();
//         System.out.print("enter second number : ");
//         int b = sc.nextInt();
//         int prod = multiply(a , b);
//         System.out.println("a*b = " + prod);

//         prod = multiply(32,5);
//         System.out.println("a*b = " + prod);
//     }
// }



//factorial of a number , n!
// import java.util.*;
// public class Function{
//     public static int factorialOfNum(int num){
//         int fact = 1;
//         for(int i = num; i>=1; i--){
//            fact  = fact*i;
//         }
//         return fact;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         int factorial = factorialOfNum(n);
//         System.out.println("factorial of " + n  + " is : " + factorial);
//     }
// }


// import java.util.*;
// public class Function{
//     public static int factorial(int num){
//         int f = 1;
//         for(int i = num; i>=1; i--){
//             f = f*i;
//         }
//         return f;
//     }
//     public static int binomialCoefficient(int n, int r){
//         int fact_N = factorial(n);
//         int fact_R = factorial(r);
//         int fact_NmR = factorial(n-r);
//         int ans  = (fact_N/(fact_R*fact_NmR));
//         return ans;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number n = ");
//         int n = sc.nextInt();
//         System.out.print("enter a number r = ");
//         int r = sc.nextInt();
//         int result = binomialCoefficient(n,r);
        
//         System.out.println("The Binomial Cofficient of  n = " + n + "," + " r = " + r + " is : " + result);
//     }
// }


// **(function overloading using parameters)
// public class Function{
//     // function to calculate sum of 2 numbers
//     public static int sum(int a , int b){
//         return a + b;
//     }
//     // function to calculate sum of 3 numbers
//     public static int sum(int a , int b , int c){
//         return a + b + c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(4,5,3));
//     }
// }


//***(function overloading using data types)
public class Function{
    //function to calculate sum of 2 int numbers
    public static int sum(int a , int b){
        return a + b;
    }
    // function to calculate sum of 2 float numbers
    public static float sum(float a , float b){
        return a + b;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(51.9f , 7.7f));
    }
}