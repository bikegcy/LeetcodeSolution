/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcoedSolution
 * @Use the letter feature.
 */
public class Solution {
    public String originalDigits(String s) {
        int[] letter = new int[26];
        int[] num = new int[10];
        for(int index = 0;index < s.length();index++){
            letter[s.charAt(index) - 'a']++;
        }
        num[0] = letter['z' - 'a'];
        num[2] = letter['w' - 'a'];
        num[4] = letter['u' - 'a'];
        num[6] = letter['x' - 'a'];
        num[7] = letter['s' - 'a'];
        num[7] -= num[6];
        num[8] = letter['g' - 'a'];
        
        num[5] = letter['v' - 'a'];
        num[5] -= num[7];
        
        num[3] = letter['t' - 'a'];
        num[3] = num[3] - num[2] - num[8];
        
        num[9] = letter['i' - 'a'];
        num[9] = num[9] - num[5] - num[6]- num[8];
        
        num[1] = letter['n' - 'a'];
        num[1] = num[1] - num[7] - 2 * num[9];
        //number ready
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j < num[i]; j++){
                result.append(i);
            }
        }
        return result.toString();
    }
}
