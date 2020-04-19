package abc.geettime.alg.dimension.one;

import java.util.Arrays;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 11:44
 */
public class RemoveArrayRepeat {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1 ;
        int start = 0 ;
        for( int i = 1 ; i< nums.length ; i ++){
            if(nums[start] != nums[i]){
                nums[++start]=nums[i];
            }
        }
        return start+1;
    }
}
