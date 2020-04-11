package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-11 16:30
 */
public class LinkListExchangeAdjacentNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head ;
        for( int i = 2 ; i< 11 ; i++){
            ListNode res = new ListNode(i);
            cur.next = res ;
            cur = res ;
        }
        //head.print();
        LinkListExchangeAdjacentNode linkListExchangeAdjacentNode = new LinkListExchangeAdjacentNode();
        ListNode listNode = linkListExchangeAdjacentNode.swapPairs(head);
        listNode.print();

    }

    public ListNode swapPairs(ListNode head) {
        if( head == null || head.next == null){
            return  head ;
        }
        ListNode a = head ;
        ListNode b = head.next ;
        head = b;
        ListNode pre = null ;
        while( a != null && b != null){
            a.next = b.next ;
            b.next = a;
            pre = a ;
            a = a.next ;
            if( a == null){
                break ;
            }
            b = a.next ;
            if( b == null ){
                pre.next = a;
            }else{
                pre.next = b ;
            }
        }
        return head ;
    }
}
