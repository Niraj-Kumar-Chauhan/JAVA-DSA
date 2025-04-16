public class Binary_string {
    public static void main(String args[]){
        binaryStringProblem(3, 0, "");
    }
    public static void binaryStringProblem(int n , int LastPlace , String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        System.out.println("hii");
        binaryStringProblem(n-1, 0, str+"0");
        if(LastPlace == 0){
            System.out.println("hello");
            binaryStringProblem(n-1, 1, str+"1");
        }
    }
}
 