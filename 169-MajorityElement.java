/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @My method uses hashmap: slow
 * @Faster algo: USe count.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        /*
        if(nums.length == 1)
            return nums[0];
        Map<Integer,Integer> majormap = new HashMap<Integer,Integer>();
        for(int index = 0;index < nums.length / 2;index++){
            majormap.put(nums[index],majormap.getOrDefault(nums[index],0) + 1);
        }
        for(int index = nums.length / 2;index < nums.length;index++){
            majormap.put(nums[index],majormap.getOrDefault(nums[index],0) + 1);
            if(majormap.get(nums[index]) > nums.length / 2)
                return nums[index];
        }
        return nums[0];
        */
        int major = nums[0];
        int count = 1;
        for(int index = 1;index < nums.length;index++){
            if(count == 0){
                count++;
                major = nums[index];
            }
            else if(major == nums[index]){
                count++;
            }
            else count--;
        }
        return major;
    }
}
