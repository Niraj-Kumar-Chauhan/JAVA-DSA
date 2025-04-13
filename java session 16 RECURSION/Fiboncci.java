public class Fiboncci {
    public static void main(String args[]){
        System.out.println(fiboncci(8));
        System.out.println(fiboncci(12));
        System.out.println(fiboncci(20));
        System.out.println(fiboncci(21));
        System.out.println(fiboncci(22));
        System.out.println(fiboncci(23));
        System.out.println(fiboncci(24));
        System.out.println(fiboncci(25));
        System.out.println(fiboncci(26));
        System.out.println(fiboncci(30));
    }
    public static int fiboncci(int n){
        if(n==0 || n==1){
            return n;
        }
        int finm1 = fiboncci(n-1);
        int finm2 = fiboncci(n-2);
        int fin = finm1 + finm2;
        return fin;
    }
}
