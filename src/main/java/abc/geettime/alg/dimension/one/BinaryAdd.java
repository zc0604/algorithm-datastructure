package abc.geettime.alg.dimension.one;

import java.math.BigInteger;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 21:11
 */
public class BinaryAdd {

    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
         int p1 = a.length() -1;
         int p2 = b.length() -1;
         int carry = 0 ;
         StringBuffer buffer = new StringBuffer();
         while( p1 >=0 || p2 >=0 ){
             if( p1 >=0)  {
                 carry+= a.charAt(p1) - '0';
                 p1 --;
             }
             if( p2 >=0)  {
                 carry+= b.charAt(p2) - '0';
                 p2--;
             }

             buffer.append(carry%2);
             carry = carry/2;
         }
         if( carry !=0 ){
             buffer.append(carry);
         }
         return buffer.reverse().toString() ;
    }
}
