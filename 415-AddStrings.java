/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcoedSolution
 * @Use stringbuilder.
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int add = 0;
        int i = num1.length() - 1,j = num2.length() - 1;
        for(;i >= 0 && j >= 0;i--,j--){
            int temp = num1.charAt(i) - '0' + num2.charAt(j) - '0' + add;
            if(temp >= 10){
                add = 1;
                temp -= 10;
                result.insert(0,temp);
            }
            else{
                add = 0;
                result.insert(0,temp);
            }
        }
        if(i >= 0){
        //nums1 is longer
            for(i = num1.length() - num2.length() - 1;i >= 0;i--){
                int temp = num1.charAt(i) - '0' + add;
                if(temp >= 10){
                    add = 1;
                    temp -= 10;
                    result.insert(0,temp);
                }
                else{
                    result.insert(0,temp);
                    i--;
                    add = 0;
                    while(i >= 0){
                        result.insert(0,num1.charAt(i) - '0');
                        i--;
                    }
                }
            }
        }
        if( j >= 0){
        //nums2 is longer
            for(i = num2.length() - num1.length() - 1;i >= 0;i--){
                int temp = num2.charAt(i) - '0' + add;
                if(temp >= 10){
                    add = 1;
                    temp -= 10;
                    result.insert(0,temp);
                }
                else{
                    result.insert(0,temp);
                    i--;
                    add = 0;
                    while(i >= 0){
                        result.insert(0,num2.charAt(i) - '0');
                        i--;
                    }
                }
            }
        }
        if(add == 1){
            result.insert(0,1);
        }
        return result.toString();
    }
}
