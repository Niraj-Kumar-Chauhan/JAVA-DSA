public class hollowRectangle {
    public static void main(String args[]){
        int n = 7;
        for(int line = 1; line <= n; line++){
            for(int j = 1; j <= n+1; j++){
                if(line == n-(n-1) || line == n){
                    System.out.print("*");
                }else{
                    if(j == n-(n-1) || j == n+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
