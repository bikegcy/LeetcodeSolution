/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 index,one from front, the other fron end to trqverse.
 * @If it is greater index2--,smaller index1++.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = numbers.length - 1;
        while(numbers[index1] + numbers[index2] != target){
            if(numbers[index1] + numbers[index2] < target){
                index1++;
            }
            else{
                index2--;
            }
        }
        int[] result = new int[2];
        result[0] = index1 + 1;
        result[1] = index2 + 1;
        return result;
    }
}
