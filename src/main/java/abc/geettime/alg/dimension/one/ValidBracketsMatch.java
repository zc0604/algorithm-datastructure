package abc.geettime.alg.dimension.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 9:27
 */
public class ValidBracketsMatch {

    public static void main(String[] args) {
        String s = "(((]]]";
        System.out.println(isValid(s));

        s = "((()))";
        System.out.println(isValid(s));

        s = "((())";
        System.out.println(isValid(s));

        s = "";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Map<Character ,Character> matches = new HashMap<>();
        matches.put('}', '{');
        matches.put(']', '[');
        matches.put(')', '(');
        if( s == null || s.equals("") ){
            return true ;
        }
        Stack<Character> stack = new Stack();
        for( int i = 0 ; i < s.length() ; i ++){
            Character c = s.charAt(i);
            if( !matches.keySet().contains(c)){
                stack.push(c);
            }else{
                if( stack.isEmpty() || !matches.get(c).equals(stack.pop())){
                    return false ;
                }
            }
        }
        return stack.isEmpty() ;
    }
}
