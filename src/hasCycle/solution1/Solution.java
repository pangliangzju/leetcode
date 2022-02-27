package hasCycle.solution1;

/**
 * @author somnu
 */
public class Solution {
    public static boolean hasCycle(ListNode head){
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode fast=pre,slow=pre;
        while(fast.next.next!=null && slow.next!=null){
            if (fast==slow){
                return true;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
}
