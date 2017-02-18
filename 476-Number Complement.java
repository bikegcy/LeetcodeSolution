/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 */
public class Solution {
    public int findComplement(int num) {
        int result = 1,temp;
        temp = num;
        while(num != 0){
            num = num >> 1;
            result =2 * result;
        }
        result = result - temp - 1;
        return result;
    }
}
