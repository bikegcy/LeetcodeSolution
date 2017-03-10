/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @Leetcode Solution
 * @Use hashmap.
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        List<Integer> store = new ArrayList<Integer>();
        for(int index = 0;index < nums1.length;index++){
            freq.put(nums1[index],freq.getOrDefault(nums1[index],0) + 1);
        }
        for(int index = 0;index < nums2.length;index++){
            int temp = freq.getOrDefault(nums2[index],0);
            if(temp > 0){
                store.add(nums2[index]);
                freq.put(nums2[index],temp - 1);
            }
        }
        int[] result = new int[store.size()];
        for(int index = 0;index < result.length;index++){
            result[index] = store.get(index);
        }
        return result;
    }
}
