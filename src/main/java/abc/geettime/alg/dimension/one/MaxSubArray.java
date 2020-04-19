package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 16:00
 */
public class MaxSubArray {


    public static void main(String[] args) {

    }


    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0 ;
        for(int num : nums){
            if( sum > 0 ){
                sum+=num ;
            }else{
                sum = num ;
            }

            res = Math.max( sum, res);
        }

        return res ;
    }
}
