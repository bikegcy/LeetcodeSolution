/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First find the sqtt of the area.
 * @Try not to use "/" which is really slow.
 */
public class Solution {
    public int[] constructRectangle(int area) {
        int[] result = {0,0};
        if(area == 0)
            return result;
        int width = (int)Math.sqrt(area);
        while(area % width != 0){
            width--;
        }
        result[0] = area / width;
        result[1] = width;
        return result;
    }
}
