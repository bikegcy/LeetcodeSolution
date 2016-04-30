public class Solution {
    public int lengthOfLIS(int[] nums) {
        int MaxLen[] = new int[nums.length];
        int currentnum,comparison;
        int MaxLIS = 0,MaxTemp;
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0;i < nums.length;i++){
            MaxLen[i] = 1;
        }
        for(currentnum = 1;currentnum < nums.length;currentnum++){
        	MaxTemp = MaxLen[0];
            for(comparison = 0;comparison < currentnum;comparison++){
                if(nums[currentnum] > nums[comparison]){
                    MaxTemp = MaxLen[comparison] + 1;
                    if(MaxLen[currentnum] < MaxTemp){
                    	MaxLen[currentnum] = MaxTemp;
                    }
                }
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(MaxLen[i] > MaxLIS){
                MaxLIS = MaxLen[i];
            }
        }
        return MaxLIS;
    }
}
