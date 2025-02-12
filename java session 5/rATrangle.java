public class rATrangle {
    public static void main(String args[]){
        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= n; star++){
                if(star <= (n-line)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
