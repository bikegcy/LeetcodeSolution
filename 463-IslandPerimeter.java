/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Same with battlship algorithm. but can be simplified.
 * @Simple method: Perimeter = island * 4 - neighbor * 2
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int row = 0;row < grid.length;row++){
            for(int column = 0;column < grid[row].length;column++){
                int temp = 0;
                if(grid[row][column] == 0)
                    continue;
                else{
                    if(row > 0 && grid[row - 1][column] == 1)
                        temp += 1;
                    if(row < (grid.length -1) && grid[row + 1][column] == 1)
                        temp += 1;
                    if(column > 0 && grid[row][column - 1] == 1)
                        temp += 1;
                    if(column < (grid[row].length - 1) && grid[row][column + 1] ==1)
                        temp += 1;
                }
                switch(temp){
                        case 0:{
                            perimeter = 4;//alone island
                            return perimeter;
                        }
                        case 1:{
                            perimeter += 3;//there is only one around it
                            break;
                        }
                        case 2:{
                            perimeter += 2;//there are 2 around it
                            break;
                        }
                        case 3:{
                            perimeter += 1;//there is one around it
                        }
                        case 4:{
                            break;//inside land
                        }
                }//end of switch
            }//end of column
        }//end of row
        return perimeter;
    }
}
