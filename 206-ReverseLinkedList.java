/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use traverse and recurtion.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode newhead = null;
    public ListNode reverseList(ListNode head) {
        /*1ms
        if(head == null || head.next == null)
            return head;
        ListNode first = head.next;
        ListNode second = first.next;
        head.next = head;
        while(first.next != null){
            first.next = head.next;
            head.next = first;
            first = second;
            second = second.next;
        }
        first.next = head.next;
        head.next = null;
        return first;
        */
        /*1ms
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
        */
        if(head == null || head.next == null)
            return head;
        reverse(head,head.next);
        return newhead;
        
    }
    private ListNode reverse(ListNode head,ListNode node){
        if(node.next == null){
            if(newhead == null)
                newhead = node;
            node.next = head;
            head.next = null;
            return head;
        }
        return reverse(head,reverse(node,node.next));
    }
    
    
    
    
}
