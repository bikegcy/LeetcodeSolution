/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use comparator to sort the array first and then use greedy algo.
 */
public class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0 || points[0].length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int []>(){
            public int compare(int[] a, int [] b){
                return a[1] - b[1];
            }
        });
        int posi = points[0][1];
        int result = 1;
        for(int index = 1;index < points.length;index++){
            if(posi >= points[index][0])
                continue;
            posi = points[index][1];
            result++;
        }
        return result;
    }
}
