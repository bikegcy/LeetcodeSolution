/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use traversal and extend the palindrome.
 */
public class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;
        int[] posi = new int[2];
        for(int i  = 0;i < s.length() - 1;i++){
            extend(s,i,i,posi);
            extend(s,i,i + 1,posi);
        }
        //System.out.println(s);
        //System.out.println(posi[0] + " " + posi[1]);
        return s.substring(posi[0],posi[0] + posi[1]);
    }
    
    private void extend(String s, int front,int end,int[] posi){
        while(front >= 0 && end < s.length() && s.charAt(front) == s.charAt(end)){
            front--;
            end++;
        }
        if(posi[1] < (end - front - 1)){
            posi[0] = front + 1;
            posi[1] = end - front - 1;
        }
    }
}
