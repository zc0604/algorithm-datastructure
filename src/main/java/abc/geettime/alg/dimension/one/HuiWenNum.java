package abc.geettime.alg.dimension.one;

/**
 * @author ：cong_zhang.
 * @date ：Created in 10:15 2020/4/14
 * @description：9. 回文数
 * @modified By：
 * @version: $version$
 */
public class HuiWenNum {

    public static void main(String[] args) {
        HuiWenNum huiWenNum = new HuiWenNum();
        System.out.println(huiWenNum.isPalindrome(-124) + "");
        System.out.println(huiWenNum.isPalindrome(12321) + "");
        System.out.println(huiWenNum.isPalindrome(1230) + "");
        System.out.println(huiWenNum.isPalindrome(0) + "");
    }

    public boolean isPalindrome(int x) {
        if( x == 0 ) return  true;
        if( x < 0 || x % 10 == 0 ){
            return false ;
        }

        int res = 0 ;
        int x_ = x;
        boolean flag = x > 0 ? true : false ;
        x  = Math.abs(x );
        while( x >0  ){
            res = res * 10 + x%10;
            x = x/10;
        }
        res = flag ? res : res * -1 ;

        return res == x_ ;
    }

}
