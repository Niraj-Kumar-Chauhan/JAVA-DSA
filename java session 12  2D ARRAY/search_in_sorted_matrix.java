// Method 1 : ---->
// public class search_in_sorted_matrix {
//     public static boolean staircaseSearch(int arr[][], int key){
//         int row = 0;
//         int col = arr.length-1;
//         while(row < arr.length && col >= 0){
//             if(key == arr[row][col]){
//                 System.out.println("Index no. of key"+"("+key+") is : " + "("+ row + "," + col + ")");
//                 return true;
//             }
//             else if(key < arr[row][col]){
//                 col--;
//             }
//             else if(key > arr[row][col]){
//                 row++;
//             }
//         }
//         System.out.println("The Key("+key+") is not found");
//         return false;

//     }
//     public static void main(String args[]){
//         int Matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
//         int key = 33;
//         staircaseSearch(Matrix, key);  
//     }
// }



// Method 2 : --->
public class search_in_sorted_matrix {
    public static boolean staircaseSearch(int arr[][], int key){
        int row = arr.length-1;
        int col = 0;
        while(row >= 0 && col < arr.length){
            if(key == arr[row][col]){
                System.out.println("Index no. of key"+"("+key+") is : " + "("+ row + "," + col + ")");
                return true;
            }
            else if(key < arr[row][col]){
                row--;
            }
            else if(key > arr[row][col]){
                col++;
            }
        }
        System.out.println("The Key("+key+") is not found");
        return false;

    }
    public static void main(String args[]){
        int Matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 20;
        staircaseSearch(Matrix, key);  
    }
}
