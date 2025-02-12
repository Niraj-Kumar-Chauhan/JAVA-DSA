// // creating an arrey
// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[] = new int[25]; // size of array is 25 
//         int numbers[] = {2 , 23 , 53}; // size of array is 3
//         int moreNumbers[] = {3 , 4 , 5 , 34}; // size of array is 4
//         String fruits[] = {"apple" , "mango" , "orange"}; // size of array is 3
//     }
// }

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int marks[] = new int[54];
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt(); 
//         marks[2] = sc.nextInt();
//         System.out.println("phy : " + marks[0]);
//         System.out.println("math : " + marks[1]);
//         System.out.println("chem : " + marks[2]);
//         float percentage = (marks[0] + marks[1] + marks[2])/3;
//         System.out.println("percentage of result : " + percentage + "%");
//         //marks[1] = 100;
//         //marks[1] = marks[1] + 2;
//         //System.out.println("math : " + marks[1]);

//         //System.out.println("size of marksArray = " + marks.length);
//     }
// }


//passing array as argument
import java.util.*;
public class array{
    public static void update(int marks[] , int number){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
        number = number + 33;
    }
    public static void main(String args[]){
        int marks[] = {98 , 89 , 90};
        int number = 34;
        update(marks , number);
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println(number);
    }
}