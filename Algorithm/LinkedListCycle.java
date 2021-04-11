/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> visitedList = new ArrayList<ListNode>();
        
        while (head != null) {
            if (!visitedList.contains(head)) {
                visitedList.add(head);
            }
            else {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
