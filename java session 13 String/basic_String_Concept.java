// import java.util.*;
// public class basic_String_Concept {
//     // String is IMMUTABLE

//     public static void main(String args[]){
//         char chArr[] = {'N', 'i', 'r', 'a', 'j'};
        
//         //Declaration of String
//         String str = "NIRAJ";
//         String str2 = new String("chauhan$11883004ndrf");

//         // string take as input from user
//         Scanner sc = new Scanner(System.in);
//         //String name = sc.next();        //sc.next() ---> this is print contigeous entity of string not print after space entity
//         //System.out.println(name);

//         //String car = sc.nextLine();   //sc.nextLine() ---> this function also print after space entity
//         //System.out.println(car);

//         //String FullName = "Niraj Chauhan";
//         //System.out.println(FullName + " , Length of " + FullName + " is : " + FullName.length() );

//         String firstName  = "Niraj";
//         String lastName = "Chauhan";
//         String FullName = firstName + " " + lastName;          // it is called concatination

//         //System.out.println(FullName);
//         System.out.println(FullName.charAt(0));
//     }
// }




import java.util.*;
public class basic_String_Concept {
    // String is IMMUTABLE

    public static void main(String args[]){
        String s1 = "Niraj";
        String s2 = "Niraj";
        String s3 = new String("Niraj");
        
        // if(s1 == s2){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("string are not equal");
        // }
        
        // if(s1 == s3){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("string are not equal");
        // }


        if(s1.equals(s3)){                                   // s1.equals(s3) ----> it check only value
            System.out.println("string are equal");
        }else{
            System.out.println("string are not equal");
        }
    }
}