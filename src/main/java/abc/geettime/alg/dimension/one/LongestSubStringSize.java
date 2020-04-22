package abc.geettime.alg.dimension.one;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：cong_zhang.
 * @date ：Created in 21:24 2020/4/22
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class LongestSubStringSize {

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring2("abcedfg");
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        int i =0 , j  = 0 ;
        int n = s.length() ;
        int res = 0 ;
        Set<Character> characterSet = new HashSet<Character>();
        while( i < n && j < n ){
            if( !characterSet.contains(s.charAt(j))){
                characterSet.add(s.charAt(j++));
                res = Math.max( res, j - i) ;
            }else{
                characterSet.remove(s.charAt(i++));
            }
        }
        return res ;
    }


    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length() ;
        int res = 0 ;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i =0 , j = 0 ; j<n ;j ++){
            if( map.containsKey( s.charAt(j))){
                i = Math.max( i , map.get(s.charAt(j)));
            }
            res = Math.max( res , j - i + 1);
            map.put( s.charAt(j), j + 1);
        }
        return res ;
    }
}
