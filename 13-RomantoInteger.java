/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use hashmap and travrese.
 */
public class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0)
            return 0;
        Map<Character,Integer> roman = new HashMap<Character,Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int result = 0,index = 0;
        for(;index < s.length() - 1;index++){
            int front = roman.get(s.charAt(index));
            int next = roman.get(s.charAt(index + 1));
            if(front >= next){
                result += front;
            }
            else result -= front;
        }
        result += roman.get(s.charAt(index));
        return result;
        
    }
}
