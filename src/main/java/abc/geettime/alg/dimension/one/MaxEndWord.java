package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 22:05
 */
public class MaxEndWord {

    public static void main(String[] args) {
        int res = lengthOfLastWord("hellos ");
        System.out.println(res);
    }
    public static int lengthOfLastWord(String s) {
        for( int i = s.length() -1 ; i >=0 ; i--){
            if( s.charAt(i) == ' '){
                return s.length() -1  - i ;
            }
        }
        return s.length();
    }
}
