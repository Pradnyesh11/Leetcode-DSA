/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) 
    {
        if(head==null)
        {
            return null;
        }
        ListNode p=null;
        ListNode c=head;
        ListNode l=head.next;

        while(c.next!=null)
        {
            c.next=p;
            p=c;
            c=l;
            l=l.next;
            

        }
        c.next=p;
        return c;

    }
}