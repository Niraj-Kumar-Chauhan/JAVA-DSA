public class Print_Incre {
    public static void main(String args[]){
        printIncre(10);
    }
    public static void printIncre(int n){
        if(n ==1){
            System.out.print(n + " ");
            return;
        }
        printIncre(n-1);
        System.out.print(n + " ");
    }
}
