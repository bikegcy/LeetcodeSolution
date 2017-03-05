/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use array to store the freq.
 */
public class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0)
            return -1;
        int[] freq = new int[26];
        for(int index = 0;index < s.length();index++){
            freq[s.charAt(index) - 'a'] += 1;
        }
        for(int index = 0;index < s.length();index++){
            if(freq[s.charAt(index) - 'a'] == 1){
                return index;
            } 
        }
        return -1;
    }
}
