public class find_length_of_string {
    public static void main(String args[]){
        String str = "niraj";
        System.out.println(lengthOfString(str));
        System.out.println(str.substring(1));
    }
    public static int lengthOfString(String str){
        if(str.length() == 0){
            return 0;
        }
        return lengthOfString(str.substring(1)) + 1;
    }
}
