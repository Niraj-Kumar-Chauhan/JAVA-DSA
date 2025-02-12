// import java.util.*;
// public class switchStt{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         switch(number){
//             case 1 : System.out.println("samosa");
//             case 2 : System.out.println("burger");
//             case 3 : System.out.println("mango shake");
//             default : System.out.println("we wake up");
//         }
//     }
// }

import java.util.*;
public class switchStt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = 'b';
        switch(ch){
            case 's' : System.out.println("samosa");
                        break;
            case 'b' : System.out.println("burger");
                        break;
            case 'm' : System.out.println("mango shake");
                        break;
            default  : System.out.println("we wake up");                                    
        }
    }
}