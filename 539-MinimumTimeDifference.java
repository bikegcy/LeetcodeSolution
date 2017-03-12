/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use array to store the time and calculate the diff.
 */
public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] min = new int[timePoints.size()];
        for(int index = 0;index < timePoints.size();index++){
            min[index] = timecal(timePoints.get(index));
        }
        Arrays.sort(min);
        int result = diff(min[0],min[min.length - 1]);
        for(int index = 0;index < min.length - 1;index++){
            int dis = diff(min[index],min[index + 1]);
            if(dis < result)
                result = dis;
        }
        return result;
        
    }
    
    private int diff(int n1,int n2){
        int res = Math.abs(n1 - n2);
        int res2 = Math.abs(n1 + 1440 - n2);
        return res < res2? res: res2;
    }
    
    private int timecal(String time){
        int hour = (time.charAt(0) - '0' ) * 10 + (time.charAt(1) - '0');
        int min = (time.charAt(3) - '0' ) * 10 + (time.charAt(4) - '0');
        return hour * 60 + min;
    }
}
