/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @Leetcode Solution
 * @My own method uses n * n timw.
 * @Use stack to be faster.
 * @Use array to realize stack even faster.
 */
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        /*
        //////O(N ^ 2)
        if(nums.length == 0)
            return new int[0];
        int moveindex = 0;
        int[] result = new int[nums.length];
        for(int index = 0;index < nums.length;index++){
            if(index != nums.length - 1)
                moveindex = index + 1;
            else moveindex = 0;
            while(moveindex != index){
                if(nums[moveindex] > nums[index])
                    break;
                else if(moveindex == nums.length - 1){
                    moveindex = 0;
                }
                else moveindex++;
            }
            if(moveindex == index)
                result[index] = -1;
            else result[index] = nums[moveindex];
        }
        return result;
        */
        /*
        //////use stack/////O(n)/////
        int n = nums.length, next[] = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n]; 
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                next[stack.pop()] = num;
            if (i < n) stack.push(i);
        }   
        return next;
        */
        ////use array,faster than stack////
        int n = nums.length, next[] = new int[n];
        int[] index = new int[n + 1];
        Arrays.fill(index, 0);
        Arrays.fill(next, -1);
        int front = 0,rear = 0;
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n]; 
            while (front != rear && nums[index[front]] < num){
                next[index[front]] = num;
                index[front--] = 0;
            }
            if (i < n){
                index[++front] = i;
            }
        }   
        return next;
    }
}
