/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First get the value of result[0];
 * @Then judge if nums[i] == 0,if ture,special case.
 * @If not, divide first then multiply to avoid exceed the bound of int.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int[] result = new int[nums.length];
        for(int index = 1;index < nums.length;index++){
            temp *= nums[index];
        }
        result[0] = temp;
        for(int index = 1;index < nums.length;index++){
            if(nums[index] == 0){
                temp = 1;
                for(int i = 0;i < nums.length;i++){
                    if(i != index){
                        result[i] = 0;
                        temp *= nums[i];
                    }
                }
                result[index] = temp;
                return result;
            }
            temp = temp / nums[index];
            temp = temp * nums[index - 1];
            result[index] = temp;
        }
        return result;
        
    }
}
