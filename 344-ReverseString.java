/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ Reverse a string.
 * @ First copy the string to a char array, then reverse the char array.
 */
public class Solution {
    public String reverseString(String s) {
        char[] result = s.toCharArray();
        int front = 0,end = s.length() - 1;
        while(front < end){
            char temp = result[front];
            result[front] = result[end];
            result[end] = temp;
            front++;
            end--;
        }
        return new String(result);
    }
}
