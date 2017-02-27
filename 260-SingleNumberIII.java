/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @My silly method: use hashmap and traverse.
 * @Better algorithm: Use XOR.
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        /*int[] result = new int[2];
        if(nums.length == 0){
            result[0] = result[1] = 0;
            return result;
        }
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int element:nums){
            freq.put(element,freq.getOrDefault(element,0) + 1);
        }
        
        int i = 0;
        for(Map.Entry<Integer,Integer> entry :freq.entrySet()){
            if(entry.getValue() == 1)
                result[i++] = entry.getKey();
        }
        return result;
        */
        int[] result = new int[2];
        if(nums.length == 0){
            result[0] = result[1] = 0;
            return result;
        }
        int temp = 0,xor = 0;
        for(int element:nums){
            xor ^= element;
        }//get XOR
        temp = xor & ~(xor - 1);//find the position of the first non-zero digit
        for(int element:nums){
            if((element & temp) != 0)
                result[0] ^= element;
        }
        result[1] = xor ^ result[0];
        return result;
    }
}
