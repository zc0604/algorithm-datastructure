package abc.geettime.alg.dimension.one;

import java.util.List;

/**
 * @author ：cong_zhang.
 * @date ：Created in 11:38 2020/4/14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class MergeSortedLinkList {

    public static void main(String[] args) {
        MergeSortedLinkList m = new MergeSortedLinkList();
        ListNode h1 = new ListNode(1);
        ListNode l1 = h1 ;
        l1 = (l1.next = new ListNode(5));

        ListNode h2 = new ListNode(1);
        ListNode l2 = h2 ;
        l2.next = new ListNode(3);

        ListNode l = m.mergeTwoLists(h1 ,h2 );
        while ( l != null ){
            System.out.print( l.val + " ");
            l = l.next ;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if( l1 == null ){
            return l2 ;
        }
        if( l2 == null ){
            return l1 ;
        }
        ListNode head = new ListNode(-1);
        ListNode pre = head ;
        while( l1 != null && l2 != null){
            if( l1.val > l2.val){
                pre.next = l2;
                l2 = l2.next ;
            }else{
                pre.next = l1 ;
                l1 = l1.next ;
            }
            pre = pre.next ;
        }
        if( l1 == null ){
            pre.next = l2;
        }
        if( l2 == null ){
            pre.next = l1;
        }
        return head.next ;
    }

}
