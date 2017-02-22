/* 
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Judge for every letter in word.
 * @3 situations:AA.../Ax.../aa...
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        int length = word.length();
        if(length == 0 || length == 1)
            return true;
        if((word.charAt(0) - 'a') < 0){
        //first letter uppercase
            if((word.charAt(1) - 'a') < 0){
                for(int index = 2;index < length;index++){
                    if((word.charAt(index) - 'a') >= 0)
                        return false;
                }
                return true;
            }//second letter uppercase
            else{
                for(int index = 2;index < length;index++){
                    if((word.charAt(index) - 'a') < 0)
                        return false;
                }
                return true;
            }//second letter lowercase
        }//first letter uppercse
        else{
            for(int index = 1;index < length;index++){
                    if((word.charAt(index) - 'a') < 0)
                        return false;
            }
            return true;
        }
    }
}
