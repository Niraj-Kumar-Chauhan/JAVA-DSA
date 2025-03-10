// on the basis of string length

/*public class largest_string {
    public static String LargestString(String arrStr[]){
        String LargStr = "";
        for(int i = 0; i<arrStr.length; i++){
            if(LargStr.length() < arrStr[i].length()){
                LargStr = arrStr[i];
            }
        }
        return LargStr;
    }
    public static void main(String args[]){
        String arrStr[] = {"apple" , "mango" , "banana"};
        System.out.println("Largest string is : " + LargestString(arrStr));
    }
}*/


// on the basis of LaxicoGraphic order

public class largest_string {
    public static void main(String args[]){
        String fruits[] = {"apple" , "mango" , "banana"};
        String LargeStr = fruits[0];
        for(int i = 1; i<fruits.length; i++){
            if(LargeStr.compareTo(fruits[i])<0){
                LargeStr = fruits[i];
            }
        }
        System.out.println("Largest string on the basis of laxicoGraphic order is : " + LargeStr);
    }
}