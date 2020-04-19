package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 11:59
 */
public class StrStrIndexOf {

    public static void main(String[] args) {
        String haystack = "adfasfd", needle = "fa" ;
        int index = strStr2(haystack, needle);
        System.out.println(index);
    }

    public static int strStr2(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        int n = haystack.length() ;
        int l = needle.length() ;
        int pn = 0 ;
        while( pn < n-l + 1){
            while( pn < n-l + 1 && haystack.charAt(pn) != needle.charAt(0)) pn ++ ;
            int curr_len = 0 ;
            int pl = 0 ;
            while( pn < n && pl < l && haystack.charAt(pn) == needle.charAt(pl)){
                curr_len ++ ;
                pn++;
                pl++;
            }

            if( curr_len == l){
                return pn - l;
            }
            pn = pn - curr_len + 1;
        }
        return -1;
    }

    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
            return - 1;
        }
        if(needle.equals("")) return 0 ;
        int len = haystack.length() ;
        int subLen = needle.length() ;
        for( int i = 0 ; i< len -subLen + 1 ;i ++){
            if( haystack.substring(i , i+ needle.length()).equals(needle)){
                return i ;
            }
        }
        return -1 ;
    }
}
