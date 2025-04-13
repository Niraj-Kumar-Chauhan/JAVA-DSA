public class Tiling_problem {
    public static void main(String args[]){
        System.out.println(tiling(6));
    }
    public static int tiling(int n){
        if(n==0 || n ==1){
            return 1;
        }
        //virtical choice arrangment
        int fnm1 = tiling(n-1);
        //horizontal choice arrangment
        int fnm2 = tiling(n-2);
        int ways = fnm1 + fnm2;
        return ways;
    }
}
