package abc.geettime.alg.dimension.one;

import java.util.Arrays;

/**
 * @author ：cong_zhang.
 * @date ：Created in 20:03 2020/4/15
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class AddOne {

    public static void main(String[] args) {
        int digits[]= {9,9,9,9};
        int res[]= plusOne(digits);
        for( int i  = 0 ; i < res.length ; i++){
            System.out.print( res[i] + " ");
        }
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }



    public static int[] plusOne(int[] digits) {
        if( digits.length == 0 ) {
            return digits ;
        }
        int res[] = Arrays.copyOf(digits, digits.length) ;
        int carray = 1;
        for( int i = res.length -1 ; i >=0 ; i--){
            int cur = res[i];
            res[i] = (cur+ carray)%10;
            carray = (cur + carray)/10;
        }
        if( carray != 0){
            int []r1 = new int[digits.length+1];
            r1[0] = 1;
            for( int i = 1 ; i< digits.length +1;i++){
                r1[i] = res[i-1] ;
            }
            return  r1;
        }
        return res;
    }
}
