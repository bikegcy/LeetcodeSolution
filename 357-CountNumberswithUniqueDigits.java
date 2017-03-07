/*
 * @Chqoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion
 */
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;
        else return (countNumbersWithUniqueDigits(n - 1) + process(n));
    }
    
    private int process(int n){
        if(n > 10)
            return 0;
        int result = 9;
        int number = 9;
        while(n > 1){
            result *= number;
            number--;
            n--;
        }
        return result;
    }
}
