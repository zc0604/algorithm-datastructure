package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 20:58
 */
public class Squrt {

    public static void main(String[] args) {
        int res = mySqrt(15);
        System.out.println(res);
    }

    public static int mySqrt(int x) {
        long a = x;
        while( a* a > x){
            a = ( a + x/a) /2;
        }
        return (int)a ;
    }
}
