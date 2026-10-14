public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode i = head1;
        ListNode j = head2;
        while(i != j)
        {
            i = (i == null) ? head2 : i.next;
            j = (j == null) ? head1 : j.next;
        }

        return i;
        
    }
}