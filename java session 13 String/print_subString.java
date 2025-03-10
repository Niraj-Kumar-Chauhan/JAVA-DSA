public class print_subString {
    public static String printSubString(String str , int si, int ei){
        String subStr = "";
        for(int i = si; i<ei; i++){
           subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "HELLOWORLD";
        int si = 0 , ei = 4;
        System.out.println(printSubString(str, si, ei));
    }
}
