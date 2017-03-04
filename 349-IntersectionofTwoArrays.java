/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LetcodeSolution
 * @Use hashmap to store the freq.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Map<Integer,Integer> numsmap = new HashMap<Integer,Integer>();
        int temp = 0,size = 0;
        for(int element :nums1){
            numsmap.put(element,numsmap.getOrDefault(element,0) + 1);
        }
        int posi = 0;
        for(int index = 0;index < nums2.length;index++){
            temp = numsmap.getOrDefault(nums2[index],0);
            if(temp > 0){
                nums2[posi++] = nums2[index];
                size++;
                numsmap.put(nums2[index],-1);
            }
        }
        int[] result = new int[size];
        
        for(int index = 0;index < size;index++){
            result[index] = nums2[index];
        }
        return result;
    }
}
