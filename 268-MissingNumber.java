/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use xor to judge.
 * @If the array is sorted then we can use binary search.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        /*
        //if it is sorted,use binary search
        if(nums == null || nums.length == 0 || nums[0] != 0)
            return 0;
        if(nums[nums.length - 1] == nums.length - 1)
            return nums.length;
        int front = 0,end = nums[nums.length - 1] + 1;
        while(end != front + 1){
            int middle = front + (end - front) / 2;
            if(nums[middle] == middle){
                front = middle;
            }
            else if(nums[middle] > middle){
                end = middle;
            }
        }
        return (nums[front] + nums[end]) / 2;
        */
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int xor = 0;
        for(int element: nums){
            xor ^= element;
            if(element < min)
                min = element;
            if(element > max)
                max = element;
        }
        if(min != 0)
            return 0;
        if(max != nums.length)
            return nums.length;
        for(int index = 0;index <= max;index++){
            xor ^= index;
        }
        return xor;
    }
}
