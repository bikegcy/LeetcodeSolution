public class Solution {
    public int mySqrt(int x) {
        int start = 1,end = x;
        if(x == 0 || x == 1){
            return x;
        }
        if(x < 0){
            return -1;
        }
        while(start + 1 < end){
            mid = start + (end - start) / 2;
            if(mid == x / mid){
                return mid;
            }else if(mid < x / mid){
                start = mid;
            }else{
                end =mid;
            }
        }
        return start;
    }
    /*
    public int mySqrt(int x) {
	    int start = 1, end = x;
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        if (x / mid >= mid && x / (mid + 1) < mid + 1) {
	            return mid;
	        } else if (x / mid < mid) {
	            end = mid - 1;
	        } else {
	            start = mid + 1;
	        }
	    }
	    return 0;
	}
	*/
    
}

