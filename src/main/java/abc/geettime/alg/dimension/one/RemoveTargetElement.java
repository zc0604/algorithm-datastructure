package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 11:53
 */
public class RemoveTargetElement {

    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int start = 0 ;
        for( int i = 0 ; i<nums.length ; i ++){
            if( nums[i] != val ){
                nums[start++] = nums[i];
            }
        }
        return start ;
    }
}
