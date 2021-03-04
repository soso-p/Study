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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode r2 = new ListNode();
        ListNode beforeNode = null;
        
        while (l1 != null && l2 != null) {
            if (result == null) { result = r2; }
            if (l1.val >= l2.val) {
                r2.val = l2.val;
                l2 = l2.next;
            }
            else {
                r2.val = l1.val;
                l1 = l1.next;
            }
            
            r2.next = new ListNode();
            beforeNode = r2;
            r2 = r2.next;
            
        }
        
        while (l1 != null) {
            if (result == null) { result = r2; }
            r2.val = l1.val;
            l1 = l1.next;
            r2.next = new ListNode();
            beforeNode = r2;
            r2 = r2.next;
        }
        
        while (l2 != null) {
            if (result == null) { result = r2; }
            r2.val = l2.val;
            l2 = l2.next;
            r2.next = new ListNode();
            beforeNode = r2;
            r2 = r2.next;
        }
        
        if (beforeNode != null) {
            beforeNode.next = null;
        }
        return result;
    }
}
