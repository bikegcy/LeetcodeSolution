/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ Find the pattern of the result:[0][1][12][1223][12232334][1223233423343445]...
 * @then apply the algorithm
 */
public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        if(num <= 0){
            result[0] = 0;
            return result;
        }
        if(num == 1){
            result[0] = 0;
            result[1] = 1;
            return result;
        }
        result[0] = 0;
        result[1] = 1;
        int expo = 1;
        int CurrentNum = 1 << expo;// CurrentNum = 2 ^ expo
        int LastNum = 0;
        
        while((CurrentNum * 2) <= num){
            LastNum = 1 << (expo - 1);
            int count1 = 0, count2 = 0;
            for(;count1 < LastNum;count1++){
                result[CurrentNum + count1] = result[LastNum + count1];
            }
            for(;count1 < CurrentNum;count1++,count2++){
                result[CurrentNum + count1] = result[CurrentNum + count2] + 1;
            }
            expo++;
            CurrentNum = 1 << expo;
        }
        for(int count = CurrentNum;count < (num + 1);){
            LastNum = 1 << (expo - 1);
            int count1 = 0, count2 = 0;
            for(;count1 < LastNum;count1++){
                if((CurrentNum + count1) <= num){
                    result[CurrentNum + count1] = result[LastNum + count1];
                }
                else continue;
            }
            for(;count1 < CurrentNum;count1++,count2++){
                if((CurrentNum + count1) <= num){
                    result[CurrentNum + count1] = result[CurrentNum + count2] + 1;
                }
                else continue;
            }
            count = CurrentNum + count1;
        }
        return result;
        
    }
}
