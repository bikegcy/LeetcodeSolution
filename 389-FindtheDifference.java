/*
 * @Chaoyu Gao
 * @cgao15@ucsc.deu
 * @LeetcodeSolution
 * @Use 2 temp char array to store the sorted string
 * @Then traverse the sorted string and compare to get the different element.
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        /*  11ms My method at the first time
        char[] temps = s.toCharArray();
        char[] tempt = t.toCharArray();
        Arrays.sort(temps);
        Arrays.sort(tempt);
        String news = new String(temps);
        String newt = new String(tempt);
        int i = 0;
        for(;i < news.length();i++){
            if(news.charAt(i) !=  newt.charAt(i))
                return newt.charAt(i);
        }
        return newt.charAt(i);
        */
        /*  10ms:bit Manipulation
        int n = s.length();
        char res = t.charAt(n);
        for(int i = 0;i < n;i++){
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }
        return res;
        */
        //6ms
        int n = s.length();
        int res = (int)t.charAt(n);
        for(int i = 0;i < n;i++){
            res -= (int)s.charAt(i);
            res += (int)t.charAt(i);
        }
        return (char)res;
        
        
    }
}
