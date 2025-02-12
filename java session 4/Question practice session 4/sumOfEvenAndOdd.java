// Question2: Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe
// even and odd integers.
import java.util.*;
public class sumOfEvenAndOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.println("enter your number");
            number = sc.nextInt();
            if(number % 2 == 0){
               evenSum += number; 
            }else{
                oddSum += number;
            }
            System.out.println("Do you wants to continue? press 1 for yes or 0 for no");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("The sum of even numbers is " + evenSum);
        System.out.println("The sum of odd numbers is " + oddSum);
    }
}
