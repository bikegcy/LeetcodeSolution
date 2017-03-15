/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use OddEnd and EvenEnd to record the current status. Use temp to help.
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode OddEnd = head;
        ListNode EvenEnd = head.next;
        while(EvenEnd.next != null && EvenEnd.next.next != null){
            ListNode temp = EvenEnd.next;
            EvenEnd.next = temp.next;
            EvenEnd = EvenEnd.next;
            temp.next = OddEnd.next;
            OddEnd.next = temp;
            OddEnd = OddEnd.next;
        }
        if(EvenEnd.next != null){
            EvenEnd.next.next = OddEnd.next;
            OddEnd.next = EvenEnd.next;
            EvenEnd.next = null;
        }
        return head;
    }
}
