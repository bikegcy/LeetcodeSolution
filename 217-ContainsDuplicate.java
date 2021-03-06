/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use HashSet to store the element.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int index = 0;index < nums.length;index++){
            freq.put(nums[index],freq.getOrDefault(nums[index],0) + 1);
            int temp = freq.get(nums[index]);
            if(temp == 2)
                return true;
        }
        return false;
        */
        Set<Integer> numsset = new HashSet<Integer>();
        for(int element: nums){
            numsset.add(element);
        }
        if(numsset.size() != nums.length)
            return true;
        else return false;
    }
}
