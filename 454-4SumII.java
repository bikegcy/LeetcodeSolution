/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @My method: Use 4 traverse(slow)
 * @Algo: Use 2 maps to store n * n sums and match.
 */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A == null || A.length == 0)
            return 0;
        /*
        int length = A.length;
        int temp1 = 0,temp2 = 0,temp3 = 0,temp4 = 0;
        int result = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        
        for(int i = 0;i < length;i++){
            temp1 = A[i];
            for(int j = 0;j < length;j++){
                temp2 = temp1 + B[j];
                for(int k = 0;k < length;k++){
                    temp3 = temp2 + C[k];
                    for(int l = 0;l < length;l++){
                        if(temp3 <= 0 && D[length - 1] < 0)
                            break;
                        if(temp3 >= 0 && D[l] > 0)
                            break;
                        temp4 = temp3 + D[l];
                        if(temp4 == 0)
                            result++;
                    }
                }
            }
        }
        return result;
        */
        int length = A.length;
        int result = 0;
        Map<Integer,Integer> sum = new HashMap<Integer,Integer>();
        for(int element1:A){
            for(int element2:B){
                sum.put(element1 + element2,sum.getOrDefault(element1 + element2, 0) + 1);
            }
        }
        for(int element1:C){
            for(int element2:D){
                result += sum.getOrDefault(-(element1 + element2),0);
            }
        }
        return result;
        
    }
}
