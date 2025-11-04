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
    public ListNode removeNthFromEnd(ListNode head, int n){
    
        if (head == null) return null;
        
        int count=1;
        int secondCount=1;
        ListNode temp=head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }

        ListNode temp2=head;

       if(count == n)
       {
         return head.next;
       }

        while(secondCount<count-n)
        {
            temp2=temp2.next;
            secondCount++;
        }

        temp2.next=temp2.next.next;
        return head;
    }
}