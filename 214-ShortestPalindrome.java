/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Traversal, slow, not working.
 */
public class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = s.length() - 1;i >= 0;i--){
            if(isPalindrome(s,0,i)){
                result.append(s);
                break;
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
    
    private boolean isPalindrome(String s,int front,int end){
        if(front == end){
            return true;
        }
        while(front < end){
            if(s.charAt(front) == s.charAt(end)){
                front++;
                end--;
            }
            else return false;
        }
        return true;
    }
}
