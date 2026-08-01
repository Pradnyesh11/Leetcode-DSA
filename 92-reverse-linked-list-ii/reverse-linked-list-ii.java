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
class Solution 
{
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(head==null || head.next==null || left==right) return head;
        ListNode a=null;
        ListNode b=head;
        ListNode c=null;
        ListNode d=head;

        for(int i=1;i<left;i++)
        {
            a=b;
            b=b.next;
        }
        for(int i=1;i<=right;i++)
        {
            c=d;
            d=d.next;
        }
        if(a!=null) a.next=null;
        c.next=null;
        ListNode t=iter(b);
        b.next=d;
        if(a!=null) 
        {
            a.next=t;
            return head;
        }
        else
        {
            return t;
        }      
    }
    public ListNode iter(ListNode temp)
    {
        if(temp==null) return null;
        ListNode p=null;
        ListNode c=temp;

        while(c!=null)
        {
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
}