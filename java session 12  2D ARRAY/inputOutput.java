import java.util.*;
public class inputOutput {

    public static void main(String[] args){
        int Matrix[][] = new int[3][3];
        int n = Matrix.length , m = Matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Enter numbers : " );
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}