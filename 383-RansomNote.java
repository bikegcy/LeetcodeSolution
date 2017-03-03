/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use hashmap to store the mafazine and traverse.
 * @New algorithm: convert letter to int.
 * @Only traverse the array twice, much faster.
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        /*
        if(ransomNote == null || ransomNote.length() == 0)
            return true;
        if(ransomNote.length() > magazine.length() || magazine == null || magazine.length() == 0)
            return false;
        Map<Character,Integer> maga = new HashMap<Character,Integer>();
        for(int i = 0;i < magazine.length();i++){
            maga.put(magazine.charAt(i),maga.getOrDefault(magazine.charAt(i),0) + 1);
        }
        for(int i = 0;i < ransomNote.length();i++){
            int num = maga.getOrDefault(ransomNote.charAt(i),0);
            if(num == 0)
                return false;
            else maga.put(ransomNote.charAt(i),maga.get(ransomNote.charAt(i)) - 1);
        }
        return true;
        */
        if(ransomNote == null || ransomNote.length() == 0)
            return true;
        if(ransomNote.length() > magazine.length() || magazine == null || magazine.length() == 0)
            return false;
        int[] maga = new int[54];
        for(int i = 0;i < magazine.length();i++){
            maga[magazine.charAt(i) - 'a'] += 1;
        }
        for(int i = 0;i < ransomNote.length();i++){
            if(maga[ransomNote.charAt(i) - 'a'] == 0)
                return false;
            maga[ransomNote.charAt(i) - 'a']--;
        }
        return true;
        
    }
}
