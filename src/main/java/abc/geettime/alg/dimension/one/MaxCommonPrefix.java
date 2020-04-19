package abc.geettime.alg.dimension.one;

/**
 * @author ：cong_zhang.
 * @date ：Created in 10:57 2020/4/14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class MaxCommonPrefix {

    public static void main(String[] args) {
        MaxCommonPrefix maxCommonPrefix = new MaxCommonPrefix();
        String strs [] = {"flower","flow","flight"};
        String res = maxCommonPrefix.longestCommonPrefix(strs) ;
        System.out.println(res);
        strs = new String[]{ "aaa","aa","aaa"};
        res = maxCommonPrefix.longestCommonPrefix(strs) ;
        System.out.println(res);

    }

    public String longestCommonPrefix(String[] strs) {
        if( strs.length == 0 ) {
            return  "";
        }
        String res = strs[0];
        for( int i = 1 ;i < strs.length ; i++){
            int start = 0 ;
            while( res.length() > 0 && strs[i].length() >0
                    && res.length() >start
                    && strs[i].length() >start
                    && res.charAt(start) == strs[i].charAt(start)){
                start ++ ;
            }
            res = res.substring( 0 ,start);
        }
        return res ;
    }
}
