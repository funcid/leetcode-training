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
    public ListNode middleNode(ListNode head) {
        
        int s = 0;

        ListNode node = head;

        while (node != null) {

            node = node.next;
            s++;
        }

        node = head;
        int i = 0;

        while (i <= s * 1.0 / 2 - 1) {

            node = node.next;
            i++;
        }

        return node;
    }
}