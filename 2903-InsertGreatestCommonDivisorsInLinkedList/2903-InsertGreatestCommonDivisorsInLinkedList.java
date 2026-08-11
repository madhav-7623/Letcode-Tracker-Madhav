// Last updated: 11/08/2026, 21:01:41
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

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {

            int g = gcd(curr.val, curr.next.val);

            ListNode node = new ListNode(g);

            node.next = curr.next;
            curr.next = node;

            curr = node.next; // move two steps ahead
        }

        return head;
    }
}