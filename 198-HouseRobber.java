/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSoluition
 * @Use dp.
 * @judge whether cerrent house to steal or not.
 */
public class Solution {
    public int rob(int[] nums) {
        int prevNo = 0;
        int prevYes = 0;
        for(int element: nums){
            int temp = prevNo;
            prevNo = Math.max(prevNo,prevYes);
            prevYes = element + temp;
        }
        return Math.max(prevNo,prevYes);
    }
}
/*
#define max(a, b) ((a)>(b)?(a):(b))
int rob(int num[], int n) {
    int a = 0;
    int b = 0;
    
    for (int i=0; i<n; i++)
    {
        if (i%2==0)
        {
            a = max(a+num[i], b);
        }
        else
        {
            b = max(a, b+num[i]);
        }
    }
    
    return max(a, b);
}
*/

