/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @Leetcode Solution
 * @Use hashmap.
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
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
        */
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length = nums1.length > nums2.length? nums1.length: nums2.length;
        int[] store = new int[length];
        int index = 0;
        int index1 = 0,index2 = 0;
        while(index1 != nums1.length && index2 != nums2.length){
            if(nums1[index1] < nums2[index2]){
                index1++;
            }
            else if(nums1[index1] > nums2[index2]){
                index2++;
            }
            else{
                store[index++] = nums1[index1];
                index1++;
                index2++;
            }
        }
        int[] result = new int[index];
        for(index1 = 0;index1 < index;index1++){
            result[index1] = store[index1];
        }
        return result;
    }
}
