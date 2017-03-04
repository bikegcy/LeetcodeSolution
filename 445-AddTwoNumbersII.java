/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 stack to store
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        while(l1 != null){
            stack1.push(l1);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode head = new ListNode(0);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            if(!stack1.isEmpty()){
                sum += stack1.pop().val;
            }
            if(!stack2.isEmpty()){
                sum += stack2.pop().val;
            }
            sum += head.val;
            ListNode node = new ListNode(sum % 10);
            head.val = sum / 10;
            node.next = head.next;
            head.next = node;
            sum = 0;
        }
        if(head.val == 0)
            head = head.next;
        return head;
        
    }
}
