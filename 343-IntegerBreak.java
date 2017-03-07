/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Kinda tricky:divided by 2,3,...,n-1.
 * @When remainder is 1,add it to the other number.
 */
public class Solution {
    public int integerBreak(int n) {
        if(n == 2)
            return 1;
        int result = 0,temp = 0;
        for(int index = 2;index < n;index++){
            int pow = n / index;
            int remainder = n % index;
            temp = (int) Math.pow(index,pow);
            if(remainder != 0)
                temp = temp * (remainder);
            if(remainder == 1 && pow > 1)
                temp = (int) Math.pow(index,pow -1) * (index + 1);
            if(temp > result)
                result = temp;
        }
        return result;
    }
}
