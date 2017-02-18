/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ Use hashmap to store the keyboard situation.
 * @ Get word by order and judge whether it is in the same row.
 */
public class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> alphabet = new HashMap<>();
        String [] letters = {"QqWwEeRrTtYyUuIiOoPp#","AaSsDdFfGgHhJjKkLl#","ZzXxCcVvBbNnMm#"};
        ArrayList<String>  NewWords = new ArrayList<String> ();
        for(int i = 0;i < 3;i++) {
            int j = 0;
            while (letters[i].charAt(j) != '#') {
                alphabet.put(letters[i].charAt(j),i + 1);
                j = j + 1;
            }
        }
        int flag= 0;
        for(int i = 0, k = 0;i < words.length;i++){
            int rank = alphabet.get(words[i].charAt(0));
            for(int j = 1;j < words[i].length();j++){
                if(rank != alphabet.get(words[i].charAt(j))){
                    flag = 1;
                }
            }
            if(flag == 0){
                NewWords.add(words[i]);
                k++;
            }
            flag = 0;
        }
        return NewWords.toArray(new String[0]);
    }
}
