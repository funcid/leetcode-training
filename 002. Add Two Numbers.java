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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String sum = getReversed(l1).add(getReversed(l2)).toString();

        int lastIndex = sum.length() - 1;

        ListNode root = new ListNode(sum.charAt(lastIndex) - '0');
        ListNode last = root;

        for (int i = lastIndex - 1; i >= 0; i--) {
            ListNode next = new ListNode(sum.charAt(i) - '0');
            last.next = next;
            last = next;
        }
        
        return root;
    }

    public java.math.BigInteger getReversed(ListNode node) {

        ArrayDeque stack = new ArrayDeque();

        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        StringBuilder builder = new StringBuilder();

        if (stack.isEmpty()) return java.math.BigInteger.ZERO;

        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return new java.math.BigInteger(builder.toString());
    }
}