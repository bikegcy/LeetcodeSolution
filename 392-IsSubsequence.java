/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 pointers to traverse.
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        if(t.length() < s.length())
            return false;
        int first = 0;
        for(int index = 0;first < s.length() && index < t.length();index++){
            if(s.charAt(first) == t.charAt(index)){
                first++;
            }
        }
        if(first == s.length())
            return true;
        else return false;
    }
}
