package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 22:15
 */
public class DeleteDuplicates {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ){
            return null ;
        }
        ListNode p0 = head;
        ListNode p1 = head.next ;
        int preVal = head.val ;
        while( p1 != null){
            int curVal = p1.val ;
            if( curVal == preVal){
                p0.next = p1.next ;
                p1 = p1.next ;
            }else{
                p0 = p1 ;
                preVal = curVal ;
            }
        }
        return head ;
    }
}
