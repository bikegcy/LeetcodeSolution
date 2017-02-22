/* 
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First find the longest arithmatic, length = n;
 * @This sequence can achieve (1 + 2 + ... + n) / 2 = (n * n) / 2 arithmatic sequences
 * @If no arithmatic strcuture, move start.
 */
public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int length = A.length;
        if(length < 3)
            return 0;
        int start = 0, second = 1,end = 2;
        int num = 0, result = 0,sub = 0;
        do{
            sub = A[second] - A[start];
            num = 0;
            if(A[end] - A[second] != sub){
                start = start + 1;
                second = start + 1;
                end = start + 2;
                continue;
            }
            while(end < length && A[end] - A[second] == sub){
                end = end + 1;
                second = second + 1;
                num = num + 1;
            }//find the longest sequence
            result += (num * num + num) / 2;
            start = end;
            second = start + 1;
            end = start + 2;
        }while(start < length - 2);
        return result;
    }
}
