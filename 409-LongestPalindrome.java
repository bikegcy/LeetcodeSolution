/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use array to store the freq of the string then traverse.
 */
public class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0)
            return 0;
        int[] letterfreq = new int[58];
        int result = 0;
        int odd = 0;
        for(int index = 0;index < s.length();index++){
            letterfreq[s.charAt(index) - 'A']++;
        }
        for(int element:letterfreq){
            result += 2 * (element / 2);
            if(element % 2 == 1)
                odd = 1;
        }
        if(odd == 1)
            return result + 1;
        else return result;
    }
}
