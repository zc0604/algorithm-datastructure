package abc.geettime.alg.dimension.one;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 15:16
 */
public class SlidingWindow {

    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow();
        int []nums = {-7,-8,7,5,7,1,6,0} ;//{1,-1};// {1,3,-1,-3,5,3,6,7} ;
        int k = 4;
        int res []= slidingWindow.maxSlidingWindow(nums, k);
        for( int i = 0 ; i <res.length ; i++){
            System.out.print(res[i] + " ");
        }
    }


    public int[] maxSlidingWindow2(int[] nums, int k) {
        if( nums.length < k ){
            return null ;
        }
        int res []= new int [nums.length-k + 1];
        Deque<Integer> deQueue = new ArrayDeque<>(k);
        for( int i = 0 ; i< nums.length ; i++){
            if( i >= k){
                 // 移除已经不再窗口内的那个元素，如果它还是当前最大
                 if(deQueue.peekFirst() == nums[i-k] ){
                     deQueue.removeFirst() ;
                 }
            }

            while( !deQueue.isEmpty() && deQueue.peekLast() < nums[i]){
                deQueue.removeLast();
            }
            deQueue.addLast(nums[i]); ;

            if( i >= k -1){
                res[i -k +1] = deQueue.peekFirst() ;
            }
        }
        return res;
    }

    //use a max heap
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( nums.length < k ){
            return null ;
        }
         int res []= new int [nums.length-k + 1];
         PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
             @Override
             public int compare(Integer o1, Integer o2) {
                 return o2.intValue() -  o1.intValue() ;
             }
         });
         for( int i = 0 ; i< nums.length ; i++){
             if( i >= k){
                 priorityQueue.remove(nums[i-k]);
             }
             priorityQueue.offer(nums[i]);
             if( i >= k-1 ){
                 res[i-k + 1] = priorityQueue.peek();
             }
         }
         return res;
    }
}
