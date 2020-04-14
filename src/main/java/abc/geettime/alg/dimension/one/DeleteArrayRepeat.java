package abc.geettime.alg.dimension.one;

/**
 * @author ：cong_zhang.
 * @date ：Created in 12:03 2020/4/14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class DeleteArrayRepeat {

    public static void main(String[] args) {
        int nums [] = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);

        for( int i = 0 ; i< res ; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if( nums == null ){
            return  -1 ;
        }
        int start = 1 ;
        for( int j = 1 ; j<nums.length ; j++){
            if( nums[start-1] != nums[j]){
                nums[start] = nums[j];
                start ++ ;
            }
        }
        return start ;
    }

}
