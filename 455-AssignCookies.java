/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First sort the array then from end, traverse.
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int childnum = g.length - 1;
        int result = 0;
        for(int index = s.length - 1;index >= 0;){
            while(childnum >= 0 && s[index] < g[childnum]){
                childnum--;
            }
            if(childnum < 0 || result == g.length)
                return result;
            childnum--;
            index--;
            result++;
        }
        return result;
    }
}
