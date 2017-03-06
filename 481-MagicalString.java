/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use array to generate the magical string.
 * @Use 2 pointers to monitor the process.
 */
public class Solution {
    public int magicalString(int n) {
        if(n == 0)
            return 0;
        if(n < 4)
            return 1;
        int[] magical = new int[n];
        magical[0] = 1;
        magical[1] = 2;
        magical[2] = 2;
        int start = 1,process = 2;
        int posi = 0;
        int result = 1;
        int[] next = new int[]{1,2};
        while(process <= n){
            start = start + 1;
            if(magical[start] == 2){
                process++;
                if(process < n){
                    magical[process] = next[posi];
                }
                if(posi == 0 && process < n){
                    result++;
                }
                process++;
                if(process < n){
                    magical[process] = next[posi];
                }
                if(posi == 0 && process < n){
                    result++;
                }
            }
            else{
                process++;
                if(process < n){
                    magical[process] = next[posi];
                }
                if(posi == 0 && process < n)
                    result++;
            }
            posi = 1 - posi;
        }
        return result;
        
    }
}
