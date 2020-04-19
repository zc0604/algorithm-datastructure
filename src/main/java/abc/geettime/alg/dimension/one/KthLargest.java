package abc.geettime.alg.dimension.one;

import java.util.PriorityQueue;

/**
 * @Description 取流式数据中第K大的元素
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 11:02
 */
public class KthLargest {

    private PriorityQueue<Integer> priorityQueue ;
    private int k ;
    public KthLargest(int k, int[] nums) {
        this.priorityQueue = new PriorityQueue<Integer>(k);
        this.k = k ;
        for( int i = 0 ; i<nums.length ; i++){
            add(nums[i]);
        }
    }

    public int add(int val) {
        if( priorityQueue.size() < k){
            priorityQueue.offer(val);
        }else{
            int currentMin = priorityQueue.peek() ;
            if( val > currentMin){
                priorityQueue.poll();
                priorityQueue.offer(val);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {

    }
}
