package abc.geettime.alg.dimension.one;

/**
 * @author ：cong_zhang.
 * @date ：Created in 13:47 2020/4/16
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class JudgeIsSubSeq {

    public static void main(String[] args) {
        boolean res = isSubsequence("axc", "ahbgdc") ;
        System.out.println(res);
    }

    static boolean isSubsequence(String s, String t) {
        int i = 0 ;
        int j = 0 ;
        while( i < s.length() && j < t.length()){
            if( s.charAt(i) == t.charAt(j)){
                i ++ ;
            }
            j ++ ;
        }
        return i == s.length() ;
    }
}
