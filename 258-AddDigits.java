/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Do not know how it works bu it does work...
 */
public class Solution {
    public int addDigits(int num) {
        /*
        if(num < 10)
            return num;
        num = ((num - 10) % 90) % 9 + 1;
        return num;
        */
        num = num - 9 * ((num - 1) / 9);
        return num;
    }
}
