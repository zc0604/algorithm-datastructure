package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther 18911
 * @create 2020-04-11 16:04
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public void print(){
        ListNode cur = this ;
        if( cur != null ){
            while( cur != null ){
                System.out.print( cur.val + " ");
                cur = cur.next ;
            }
        }
    }
}
