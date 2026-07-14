// Last updated: 7/14/2026, 2:00:15 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null){
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }
}