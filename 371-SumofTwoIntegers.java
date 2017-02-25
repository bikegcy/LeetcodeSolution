/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First do not use bit manipulation.
 * @Take it into 2 parts:a ^ b, (a & b)<<1 and get the sum of it;
public class Solution {
    public int getSum(int a, int b) {
        /*
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        int temp = 0;
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        int k = b;
        for(int i = 0;i < Math.abs(a);i++){
            if(a > 0)
                k++;
            else k--;
        }
        return k;
        */
        if(b == 0)
            return a;
        //a ^ b is to get the different part in binary representation
        //(a & b) << 1 is to get the same part in binary representation
        return(getSum(a^b,(a&b)<<1));
    }
}
