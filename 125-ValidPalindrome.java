/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 pointers,front and end.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
            return true;
        s = s.toLowerCase();
        int front = 0,end = s.length() - 1;
        while(front < end){
            if(s.charAt(front)  - 'a' < 0 || s.charAt(front) - 'a' > 25){
                if(s.charAt(front)  - '0' < 0 || s.charAt(front) - '0' > 9){
                    front++;
                    continue;
                }
            }
            if(s.charAt(end)  - 'a' < 0 || s.charAt(end) - 'a' > 25){
                if(s.charAt(end)  - '0' < 0 || s.charAt(end) - '0' > 9){
                    end--;
                    continue;
                }
            }
            if(s.charAt(front) == s.charAt(end)){
                front++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
