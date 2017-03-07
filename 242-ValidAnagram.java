/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use array to store the freq the letter.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] letter = new int[26];
        for (int index = 0;index < s.length();index++){
            letter[s.charAt(index) - 'a']++;
            letter[t.charAt(index) - 'a']--;
        }
        for(int element: letter){
            if(element != 0 )
                return false;
        }
        return true;
    }
}
