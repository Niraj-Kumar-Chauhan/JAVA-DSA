import java.util.*;
public class search_keyElem {
    public static boolean search_key(int arr[][], int key , int n , int m){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j] == key){
                    System.out.println("The  key"+"("+key+")"+ " Found at cell (" + i + "," + j + ")" );
                    return true;
                }
            }
        }
        System.out.println("The key"+"("+key+ ")" + " not Found!");
        return false;
    }

    public static void main(String args[]){
        int Matrix[][] = new int[4][3];
        int n = Matrix.length , m = Matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  numbers : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        // print 2D array
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        int key = 5;
        search_key(Matrix , key , n , m); 
    }
}