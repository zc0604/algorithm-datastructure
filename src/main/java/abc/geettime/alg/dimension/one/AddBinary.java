package abc.geettime.alg.dimension.one;

import java.math.BigInteger;

/**
 * @author ：cong_zhang.
 * @date ：Created in 20:20 2020/4/15
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class AddBinary {

    public static void main(String[] args) {

    }

    public static String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a , 2);
        BigInteger b1 = new BigInteger(b , 2);
        return  a1.add(b1).toString(2);
    }
}
