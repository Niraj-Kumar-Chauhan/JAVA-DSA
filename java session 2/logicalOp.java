import java.util.*;
public class logicalOp{
    public static void main(String args[]){
        System.out.println( (43>3) && (34>2) );
        System.out.println( (43>3) && (34<2) );
        System.out.println( (558<454) || (45<455) );
        System.out.println( (558<454) || (45>455) );
        System.out.println( !(44 == 45) );
    }
}
