package reverselist.solution1;

/**
 * @author somnu
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums={2,4,6,3,1,0,7,9};
        ListNode head=buildlist(nums);
        ListNode reversedNode=reverselist(head,1,3);
        System.out.println(1);
    }
//    假设begin不会是0
    public static ListNode reverselist(ListNode head,int begin,int length){
        ListNode pre=head;
        ListNode curr=head.next;
        while(--begin>0){
            pre=pre.next;
            curr=curr.next;
        }
        ListNode newHead=pre;
        ListNode next=curr.next;
        while(--length >= -1){
            curr.next=pre;
            pre=curr;
            ListNode newNext=next.next;
            curr=next;
            next=newNext;

        }
        return newHead.next;
    }

    public static ListNode buildlist(int[] nums){
        ListNode pre=new ListNode(0),curr=pre;
        for(int num:nums){
            ListNode node=new ListNode(num);
            curr.next=node;
            node.next=null;
            curr=node;
        }
        return pre.next;
    }
}
