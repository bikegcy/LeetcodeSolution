/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use O(n) space and O(n) time.
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        int[] nums = new int[length];
        for(int i = 0;i < length;i++){
            nums[i] = head.val;
            head = head.next;
        }
        int front = 0,end = length - 1;
        while(front < end){
            if(nums[front] == nums[end]){
                front++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
