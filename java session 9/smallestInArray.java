public class smallestInArray {
    public static int smallest_num(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<number.length; i++){
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int number[] = { 2,55,22,-6,7,4,1,86,43,2};
        System.out.println("The Smallest Number In The Array Is : " + smallest_num(number));
    }
}
