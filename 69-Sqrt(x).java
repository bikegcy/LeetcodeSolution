public class Solution {
    public int mySqrt(int x) {
        int start = 1,end = x;
        int mid = 1;
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
            }
            else if(mid < x / mid){
                start = mid;
            }
            else{
                end =mid;
            }
        }
        return start;
    }
}
