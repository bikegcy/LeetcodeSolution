/1* 
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First get the smallest number of the queue and then insert.
 * @Weak point: result = -1, max = 99999999.
 */
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];
        int[][] result = new int[people.length][people[0].length];
        int population = people.length;
        //int temp = 0;
        int min = 0;
        for (int i = 0;i < population;i++) {
            for(int j = 0;j< people[0].length;j++){
                result[i][j] = -1;
            }
        }
        for(int i = 0;i < population;i++){
            for(int index = 0;index < population;index++){
                if(people[index][0] <= people[min][0]){
                    //System.out.println(min);
                    if(people[index][0] != people[min][0]){
                        min = index;
                        //System.out.println(min);
                    }
                    else{
                        if(people[index][1] < people[min][0]){
                            min = index;
                        }
                    }
                }//end of if
            }//end of inside for: find the smallest height and record it
            int temp = people[min][1] + 1,index = 0;
            for(;temp > 0;index++){
                if(index == population)
                    break;
                if(result[index][0] == -1 || result[index][0] == people[min][0]){
                    temp--;
                }
            }//find the insertion position
            result[index - 1][0] = people[min][0];
            result[index - 1][1] = people[min][1];
            people[min][0] = 99999999;
        }
        return result;
    }
}

