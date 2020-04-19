package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 15:40
 */
public class CoundAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n -1 );
        int cur = 1;
        int p = 0 ;
        StringBuffer buffer = new StringBuffer();
        for(; cur < s.length() ; cur ++){
            if( s.charAt(cur) != s.charAt(p)){
                 int num = cur - p;
                 buffer.append(num + "" + s.charAt(p) );
                 p= cur ;
            }
        }

        if( p != cur){
            int num = cur - p;
            buffer.append(num + "" + s.charAt(p) );
        }
        return buffer.toString();
    }
}
