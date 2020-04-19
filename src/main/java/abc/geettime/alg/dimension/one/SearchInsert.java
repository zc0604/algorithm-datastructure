package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 14:52
 */
public class SearchInsert {
    public static void main(String[] args) {
        int nums[] = {1,3}, target = 2;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }

    public static int searchInsert(int[] nums, int target) {
        if( nums.length == 0 ){
            return  0;
        }
        int left = 0 ;
        int right = nums.length ;
        while(left < right){
            int mid = (left + right)/2;
            if( nums[mid] < target){
                left = mid +1 ;
            }else {
                right = mid;
            }
        }
        return left ;
    }
}
