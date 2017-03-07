/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution 
 * @Use 12 * 60 traverse to judge.
 */
public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        String temp = new String();
        int count1 = 0,count2 = 0;
        for(int h = 0;h < 12;h++){
            count1 = Integer.bitCount(h);
            for(int min = 0;min < 60;min++){
                count2 = Integer.bitCount(min);
                if(count1 + count2 == num){
                    if(min >= 10)
                        temp = Integer.toString(h) + ":" + Integer.toString(min);
                    else temp = Integer.toString(h) + ":0" + Integer.toString(min);
                    result.add(temp);
                }
                
            }
        }
        return result;
    }
}
