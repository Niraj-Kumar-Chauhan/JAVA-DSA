import java.util.*;
public class primeOrNot {
    public static void  main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         
         if(num == 1){
            System.out.println("num is not prime number");
         }else{
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(num); i++){
               if(num%i == 0){
                isPrime = false;
               }
            }
            if(isPrime == true){
               System.out.println("num is prime number");
            }else{
               System.out.println("num is not prime number");
            }
          
         }
         
    }
}
