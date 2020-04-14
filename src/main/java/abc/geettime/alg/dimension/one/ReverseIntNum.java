package abc.geettime.alg.dimension.one;

/**
 * @author ：cong_zhang.
 * @date ：Created in 9:52 2020/4/14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class ReverseIntNum {

    public static void main(String[] args) {
        int num = 1234544444;
        int res = new ReverseIntNum().reverse(num);
        System.out.println(res);
        num = -123;
        res = new ReverseIntNum().reverse(num);
        System.out.println(res);
    }

    public int reverse(int x) {
        long res = 0 ;
        boolean flag = x > 0 ? true : false ;
        x  = Math.abs(x );
        while( x >0  ){
            res = res * 10 + x%10;
            x = x/10;
        }
        res = flag ? res : res * -1 ;
        return res <= Integer.MAX_VALUE && res>= Integer.MIN_VALUE ? (int)res : 0 ;
    }
}
