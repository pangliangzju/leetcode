package mergeTwoList.solution1;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author somnu
 */
public class Solution {

    public static void main(String[] args) {
        int[] num1={1,2,2,3,5,5};
        int[] num2={2,2,2,4,4,6};
        ListNode list1=buildlist(num1);
        ListNode list2=buildlist(num2);
        ListNode ans=mergeTwoLists(list1,list2);
        int a=1;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        LinkedList<Integer> stack=new LinkedList<>();
        
        if(list1.val== list2.val){
            while(list1.next.val== list1.val){
                list1=list1.next;
            }
            while (list2.next.val==list2.val){
                list2=list2.next;
            }
            list2=list2.next;
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
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
