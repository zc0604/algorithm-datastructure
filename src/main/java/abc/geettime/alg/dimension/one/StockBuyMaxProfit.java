package abc.geettime.alg.dimension.one;

/**
 * @author ：cong_zhang.
 * @date ：Created in 20:35 2020/4/15
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class StockBuyMaxProfit {

    public static void main(String[] args) {
        int prices []= {7,1,5,3,6,4} ;
        int res = maxProfit(prices) ;
        System.out.println(res );
    }

    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE ;
        int max_sale = 0 ;
        for( int i = 0 ; i < prices.length ; i ++ ){
            if( prices[i] < min_price){
                min_price = prices[i];
            }else if( prices[i] - min_price > max_sale){
                max_sale = prices[i] - min_price;
            }
        }
        return max_sale ;
    }


    public static int maxProfit2(int[] prices) {
        if( prices.length <=1) return 0 ;
        int max = 0 ;
        int index = 1 ;
        for( int i = 0 ; i < prices.length ; i ++ ){
            for( int j = i + 1 ; j <prices.length ; j++){
                int sales = prices[j] - prices[i];
                if( sales > max){
                    max = sales ;
                }
            }
        }
        return max ;
    }

}
