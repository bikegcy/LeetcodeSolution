/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LEetcodeSolution
 * @Use fast and slow to determine.
 * @Faster method: use the relationshuip bewteen slow and fast.
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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode comp = head;
        ListNode origin = head;
        while(comp != null && head != null && head.next != null){
            comp = comp.next;
            head = head.next.next;
            if(comp == head){
                break;
            }
        }
        if(head != comp)
            return null;
        head = origin;
        /*
        while(comp != head){
            ListNode temp = comp;
            comp = comp.next;
            while(comp != temp){
                if(comp == head)
                    return head;
                comp = comp.next;
            }
            head = head.next;
        }
        */
        while(head != comp){
            head = head.next;
            comp = comp.next;
        }
        return head;
        
    }
}
