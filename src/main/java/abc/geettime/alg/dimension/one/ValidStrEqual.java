package abc.geettime.alg.dimension.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description 判断两个字符串中字符和个数是否一致
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 12:22
 */
public class ValidStrEqual {

    public static void main(String[] args) {
        System.out.println(isAnagram("abced","abced44"));
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> sm = stringToMap(s);
        Map<Character,Integer> tm = stringToMap(t);
        Iterator<Map.Entry<Character,Integer>> skeyIter = sm.entrySet().iterator() ;
        while(skeyIter.hasNext()){
            Map.Entry<Character,Integer> skey = skeyIter.next() ;
            if( !skey.getValue().equals(tm.get(skey.getKey()))){
                return false ;
            }
            skeyIter.remove();
            tm.remove(skey.getKey());
        }
        return sm.isEmpty() && tm.isEmpty();
    }

    private static Map<Character,Integer> stringToMap(String s){
        Map<Character,Integer> sm = new HashMap<Character,Integer>();
        for( char c : s.toCharArray()){
            if( sm.get(c) == null ){
                sm.put(c, 1);
            }else{
                sm.put(c ,sm.get(c) + 1);
            }
        }
        return  sm ;
    }


}
