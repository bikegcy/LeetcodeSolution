/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 pointers, slow and fast to judge.
 */
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
        if(head == null)
            return false;
        ListNode comp = head;
        while(comp != null && head != null && head.next != null){
            comp = comp.next;
            head = head.next.next;
            if(comp == head)
                return true;
        }
        return false;
    }
}
