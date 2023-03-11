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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode root = null;
        ListNode copy = null;

        while(list1 != null || list2 != null) {
            
            ListNode left = list1;
            ListNode right = list2;

            ListNode smaller = left == null ? right : right == null ? left : right.val > left.val ? left : right;

            if (list1 == smaller) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }

            if (root == null) {
                
                root = new ListNode(smaller.val);
                copy = root;
            } else {

                while (copy.next != null) {
                    copy = copy.next;
                }
                copy.next = new ListNode(smaller.val);
            }
        }

        return root;
    }
}