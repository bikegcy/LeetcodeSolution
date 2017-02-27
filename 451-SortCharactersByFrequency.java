/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use Hashmap to store the frenquency
 * @Use list comparor to sort the hash.value
 * @store it in char array,then to string
 */
import java.util.Map;
import java.util.Map.Entry;
public class Solution {
    public String frequencySort(String s) {
        if(s.isEmpty())
            return s;
        char[] result = new char[s.length()];
        Map<Character,Integer> lettermap = new HashMap<Character,Integer>();
        for(int i = 0;i < s.length();i++){
            lettermap.put(s.charAt(i),lettermap.getOrDefault(s.charAt(i),0) + 1);
        }
        //initiate the letter frenquency hashmap
        
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(lettermap.entrySet());
        //use comparator to sort
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
            //decrease order
            public int compare(Entry<Character,Integer> o1, Entry<Character,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        int i = 0;
        for(Map.Entry<Character,Integer> mapping :list){
            for(int index = 0;index < mapping.getValue();index++){
                result[i] = mapping.getKey();
                i++;
            }
        }
        String res = new String(result);
        return res;
    }
}
