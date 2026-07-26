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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode l3=new ListNode(0);
        ListNode cr=l3;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                cr.next=list1;
                list1=list1.next;
            }
            else
            {
                cr.next=list2;
                list2=list2.next;
            }
            cr=cr.next;
        }
        cr.next = list1==null ? list2:list1;
        return l3.next;
    }
}