package abc.geettime.alg.dimension.one;

import java.util.Arrays;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 21:40
 */
public class CheckRecord {
    public static void main(String[] args) {
        boolean flag = checkRecord("");
        System.out.println(flag);
    }

    public static boolean checkRecord(String s) {
        int count = 0 ;
        for( int i = 0 ; i< s.length() && count < 2; i ++){
            if( s.charAt(i) == 'A' ){
                count ++ ;
            }

            if( i <= s.length() -3 && s.charAt(i) == 'L' && s.charAt(i+1) == 'L' &&  s.charAt(i+2) == 'L' ){
                return false ;
            }
        }
        return count <2;
    }
}
