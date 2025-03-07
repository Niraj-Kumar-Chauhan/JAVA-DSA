import java.util.*;
public class basic_String_Concept {
    // String is IMMUTABLE

    public static void main(String args[]){
        char chArr[] = {'N', 'i', 'r', 'a', 'j'};
        
        //Declaration of String
        String str = "NIRAJ";
        String str2 = new String("chauhan$11883004ndrf");

        // string take as input from user
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();        //sc.next() ---> this is print contigeous entity of string not print after space entity
        //System.out.println(name);

        //String car = sc.nextLine();   //sc.nextLine() ---> this function also print after space entity
        //System.out.println(car);

        //String FullName = "Niraj Chauhan";
        //System.out.println(FullName + " , Length of " + FullName + " is : " + FullName.length() );

        String firstName  = "Niraj";
        String lastName = "Chauhan";
        String FullName = firstName + " " + lastName;          // it is called concatination

        //System.out.println(FullName);
        System.out.println(FullName.charAt(0));
    }
}