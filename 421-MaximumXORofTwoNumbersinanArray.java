/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution 
 * @Judge from the most sigmificant posi.T: 32 * n
 */
public class Solution {
    public int findMaximumXOR(int[] nums) {
        int filter = 0,max = 0;
        for(int bit = 31;bit >= 0;bit--){
            filter = filter | (1 << bit);
            Set<Integer> set = new HashSet<Integer>();
            for(int element: nums){
                set.add(element & filter);
            }
            int temp = max | (1 << bit);
            for(int element: set){
                if(set.contains(element ^ temp)){
                    max = temp;
                    break;
                }
            }
        }
        return max;
    }
}
