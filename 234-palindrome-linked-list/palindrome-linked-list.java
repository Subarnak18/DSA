class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip middle node for odd length
        if (fast != null) {
            slow = slow.next;
        }

        // Reverse second half
        slow = reverseList(slow);

        fast = head;

        // Compare
        while (slow != null) {

            if (fast.val != slow.val) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {

            ListNode next = head.next;

            head.next = prev;

            prev = head;

            head = next;
        }

        return prev;
    }
}