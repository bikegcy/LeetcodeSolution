/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 traverse and bit manipulation.
 */
public class Solution {
    public int maxProduct(String[] words) {
        int posi = 0;
        int result = 0;
        for(int index1 = 0;index1 < words.length;index1++){
            int temp = words[index1].length();
            for(int i = 0;i < temp;i++){
                posi |= (1 << (int)(words[index1].charAt(i) - 'a'));
            }
            for(int index2 = 0;index2 < words.length;index2++){
                temp = words[index1].length();
                for(int i = 0;i < words[index2].length();i++){
                    char c = words[index2].charAt(i);
                    if((posi & (1 << (int)(c - 'a'))) != 0){
                        temp = 0;
                        break;
                    }
                }
                temp *= words[index2].length();
                if(temp > result)
                    result = temp;
            }
            posi = 0;
        }
        return result;
    }
}
