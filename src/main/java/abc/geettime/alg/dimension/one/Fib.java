package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther 18911
 * @create 2020-04-11 15:17
 */
public class Fib {

    public static void main(String[] args) {
        System.out.println(fibvalue(8));
    }

    public static int fibvalue( int n ){
        if( n == 0 || n ==1){
            return 1 ;
        }
        int f0 = 1;
        int f1 = 1;
        int temp = 0 ;
        for( int i = 2 ; i <= n  ; i ++){
            temp = f1;
            f1 = f1 + f0 ;
            f0 = temp ;
        }
        return f1 ;

    }
}
