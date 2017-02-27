/* 
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @If it is 4 * k stones then I lose.
 * @If it is not, I pick the stone to make the rest 4 * k so I win.
 */
public class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0)
            return false;
        if(n % 4 != 0)
            return true;
        return true;
    }
}
