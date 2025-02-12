import java.util.*;
public class feverOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextInt();
        if(temp > 100){
            System.out.println("you have a fever");
        }else{
            System.out.println("you don't have a fever");
        }
    }
}
