/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ Use the algorithm to convert decimal to binary.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int Remainder1, Remainder2;
        int result;
        result = 0;
        do{
            Remainder1 = x % 2;
            Remainder2 = y % 2;
            x = x / 2;
            y = y / 2;
            if(Remainder1 != Remainder2){
                result++;
            }
        }while(x >= 1 || y>= 1);
        return result;
    }
}
