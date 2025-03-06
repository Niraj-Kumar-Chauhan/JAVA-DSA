public class num_of_keyElem_in_matrix{
    public static int toGetNumOfKeyElement(int arr[][], int key){
        int count = 0;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                if(key == arr[row][col]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int Matix[][] = {{4,7,8},{8,8,7}};
        int key = 10;
        int result = toGetNumOfKeyElement(Matix, key);
        System.out.println("Number of "+key+"'s in matrix is : " + result);
    }
}