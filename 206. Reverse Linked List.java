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
    public ListNode reverseList(ListNode head) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        ListNode wrapper = new ListNode();
        ListNode root = wrapper;

        while (head != null) {

            stack.push(head.val);
            head = head.next;
        }

        while (!stack.isEmpty()) {

            wrapper.next = new ListNode(stack.pop());
            wrapper = wrapper.next;
        }

        return root.next;
    }
}