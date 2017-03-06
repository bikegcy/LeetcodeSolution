/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use array[26] to store the map then traverse the string s.
 */
public class Solution {
    public int titleToNumber(String s) {
        if(s.length() == 0)
            return 0;
        int[] lettermap = new int[26];
        int result = 0,digit = s.length();
        for(int index = 0;index < 26;index++){
            lettermap[index] = index + 1;
        }
        for(int index = 0;index < digit;index++){
            result += lettermap[s.charAt(index) - 'A'] * (int) Math.pow(26,digit - index - 1);
        }
        return result;
    }
}
