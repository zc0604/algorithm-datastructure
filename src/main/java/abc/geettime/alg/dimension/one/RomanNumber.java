package abc.geettime.alg.dimension.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：cong_zhang.
 * @date ：Created in 10:24 2020/4/14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class RomanNumber {

    public static void main(String[] args) {
        RomanNumber romanNumber = new RomanNumber();
        int res = romanNumber.romanToInt("LVIII");
        System.out.println(res);
        res = romanNumber.romanToInt("IX");
        System.out.println(res);
    }


    public int romanToIntGood(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        if( s == null || s.length() == 0 ){
            return -1;
        }
        Map<Character ,Integer> map = new HashMap<Character,Integer>();
        map.put( 'I', 1 );
        map.put( 'V', 5 );
        map.put( 'X', 10);
        map.put( 'L', 50 );
        map.put( 'C', 100 );
        map.put( 'D', 500 );
        map.put( 'M', 1000 );
        int res = 0 ;
        for( int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i) ;
            if( !map.keySet().contains( c )){
                return -1;
            }
            if( i > 0 ) {
                if ( ( c == 'V' || c == 'X') && s.charAt(i - 1) == 'I') {
                    res = res - 2 ;
                }else if( ( c == 'L' || c == 'C') && s.charAt(i - 1) == 'X' ){
                    res = res - 20 ;
                }else if( ( c == 'D' || c == 'M') && s.charAt(i - 1) == 'C' ){
                    res = res - 200 ;
                }
            }

            int k = map.get(c);
            res = res + k ;
        }

        return res ;
    }
}
