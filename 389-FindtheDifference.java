/*
 * @Chaoyu Gao
 * @cgao15@ucsc.deu
 * @LeetcodeSolution
 * @Use 2 temp char array to store the sorted string
 * @Then traverse the sorted string and compare to get the different element.
 */
public class Solution {
    public char findTheDifference(String s, String t) {
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
    }
}
