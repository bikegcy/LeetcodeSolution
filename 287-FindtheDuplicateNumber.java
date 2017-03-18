/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use fast and slow to do.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length <= 2)
            return 1;
        int fast = nums[nums[0]];
        int slow = nums[0];
        while(fast != slow){
            fast = nums[nums[fast]];
            slow = nums[slow];
        }
        slow = 0;
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
    }
}
