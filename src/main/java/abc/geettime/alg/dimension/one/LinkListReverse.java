package abc.geettime.alg.dimension.one;

/**
 * @Description
 * @auther 18911
 * @create 2020-04-11 16:04
 */
public class LinkListReverse {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head ;
        for( int i = 2 ; i< 10 ; i++){
            ListNode res = new ListNode(i);
            cur.next = res ;
            cur = res ;
        }
        head.print();
        ListNode listNode = new LinkListReverse().reverseList(head) ;
        if( listNode != null ){
            listNode.print();
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null ;
        ListNode cur = head ;
        while( cur != null ){
            ListNode temp = cur.next ;
            cur.next = pre ;
            pre = cur ;
            cur = temp;
        }
        return pre ;
    }
}


