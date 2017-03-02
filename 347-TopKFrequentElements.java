/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use hashmap to store the number.
 * @Sort the freanquency and return the result.
 */
import java.util.Map.Entry;
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqmap = new HashMap<Integer,Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int element:nums){
            freqmap.put(element,freqmap.getOrDefault(element,0) + 1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(freqmap.entrySet());
        //use comparator to sort
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //decrease order
            public int compare(Entry<Integer,Integer> o1, Entry<Integer,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        int i = 0;
        for(Map.Entry<Integer,Integer> mapping :list){
            result.add(mapping.getKey());
            i++;
            if(i == k)
                break;
        }
            
        return result;
    }
}
