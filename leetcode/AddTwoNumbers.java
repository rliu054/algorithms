public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        int carry = 0;

        while ((l1 != null) || (l2 != null)) {
            if (l1 == null) {
                tail.next = new ListNode((l2.val+carry) % 10);
                carry = (l2.val+carry) / 10;
                l2 = l2.next;
            } else if (l2 == null) {
                tail.next = new ListNode((l1.val+carry) % 10);
                carry = (l1.val+carry) / 10;
                l1 = l1.next;
            } else {
                tail.next = new ListNode((l1.val+l2.val+carry) % 10);
                carry = (l1.val+l2.val+carry) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (carry != 0)
            tail.next = new ListNode(carry);
        return head.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
