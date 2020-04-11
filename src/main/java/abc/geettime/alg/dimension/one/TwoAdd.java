package abc.geettime.alg.dimension.one;

import java.util.HashMap;

/**
 * @Description
 * @auther 18911
 * @create 2020-04-11 15:39
 */
public class TwoAdd {

    public static void main(String[] args) {
        TwoAdd twoAdd = new TwoAdd();
        int[] res = twoAdd.twoSum( new int[]{2,7,12,44,1144},  19) ;
        if( res != null){
            for( int i = 0 ; i < res.length ; i++){
                System.out.print(res[i] + " ");
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap();
        for(int i =0 ; i<nums.length ;i++){
            Integer j = hash.get( target - nums[i]);
            if( j != null){
                return new int[]{ j.intValue(), i};
            }else{
                hash.put( nums[i], i);
            }
        }
        return null ;
    }
}
