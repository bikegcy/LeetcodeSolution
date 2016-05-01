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
    /*
    public int lengthOfLIS(int[] nums) {
	    if (nums == null) {
	        return 0;
	    }
	    
	    List<Integer> seq = new ArrayList();
	    for (int i = 0; i < nums.length; i++) {
	        updateSequence(seq, nums[i]);
	    }
	    
	    return seq.size();
	}
	
	private void updateSequence(List<Integer> seq, int elem) {
	    int start = 0, end = seq.size() - 1;
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        if (seq.get(mid) == elem) {
	            return;
	        } else if (seq.get(mid) < elem) {
	            start = mid + 1;
	        } else {
	            end = mid - 1;
	        }
	    }
	    
	    if (start >= seq.size()) {
	        seq.add(elem);
	    } else {
	        seq.set(start, elem);
	    }
	}
	*/
}
