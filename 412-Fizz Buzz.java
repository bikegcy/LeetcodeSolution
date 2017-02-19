/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ First judge whether it is k * 15, then k * 5, then k * 3,then the integer itself.
 * @ Learn how to use List.add(i,"test"),List.remove(i)
 */
 public class Solution {
    public List<String> fizzBuzz(int n) {
        //String[] result = new String[n];
        List<String> result = new ArrayList<String>();
        for(int index = 1;index <= n;index++){
            if(index % 15 == 0){
                result.add(index - 1, "FizzBuzz");
                continue;
            }
            else if(index % 5 == 0){
                result.add(index - 1, "Buzz");
                continue;
            }
            else if (index % 3 == 0){
                result.add(index - 1, "Fizz");
                continue;
            }
            else{
                result.add(index - 1,Integer.toString(index));
            }
        }
        /*
        result.add(index - 1,Integer.toString(index));
        int index = 3;
        while(index <= n){
            result.remove(index - 1);
            result.add(index - 1,"Fizz");
            index = index + 3;
        }
        index = 5;
        while(index <= n){
            result.remove(index - 1);
            result.add(index - 1, "Buzz");
            index = index + 5;
        }
        index = 15;
        while(index <= n){
            result.remove(index - 1);
            result.add(index - 1, "FizzBuzz");
            index = index + 15;
        }
        */
        return result;
    }
}
