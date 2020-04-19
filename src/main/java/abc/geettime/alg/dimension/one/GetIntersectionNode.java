package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 22:01
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB ;
        while( p1 != p2){

            if( p1 != null){
                p1 = p1.next;
            }
            if( p2 != null ){
                p2 = p2.next ;
            }
            if( p1 == null && p2 == null ){
                return null ;
            }

            if( p1 == null){
                p1 = headB;
            }
            if( p2 == null){
                p2 = headA;
            }
        }
        return p1;

    }
}
