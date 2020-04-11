package abc.geettime.alg.dimension.one;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-11 17:38
 */
public class LinkCircle {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head ;
        for( int i = 2 ; i< 11 ; i++){
            ListNode res = new ListNode(i);
            cur.next = res ;
            cur = res ;
        }
        //cur.next = head ;
        System.out.println(hasCycle(head));
    }


    public static boolean hasCycle(ListNode head) {
        ListNode fast = head ;
        ListNode slow = head ;
        while( fast != null && slow != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if( slow == fast){
                return  true ;
            }
        }
        return  false ;
    }

    public static boolean hasCycle2(ListNode head) {
        Set<ListNode> listNode = new HashSet<ListNode>();
        ListNode p = head ;
        while(p != null ){
            if( listNode.contains( p)){
                return true ;
            }
            listNode.add(p);
            p = p.next ;
        }
        return false ;
    }
}
