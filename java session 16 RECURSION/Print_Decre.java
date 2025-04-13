import java.util.*;
public class Print_Decre {

    public static void main(String args[]){
        printDecre(10);
    }
    public static void printDecre(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecre(n-1);
    }
}