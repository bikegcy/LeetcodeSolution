/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @There are only four situations(out of bound)
 * @When out of bound, change direction and position.
 */
public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[0];
        int row = matrix.length;
        int column = matrix[0].length;
        int[] result = new int [row * column];
        int[][] direction = new int[][]{{-1,1},{1,-1}};
        int rowposi= 0, colposi = 0,dir = 0;
        for(int index = 0;index < row * column;index++){
            result[index] = matrix[rowposi][colposi];
            rowposi += direction[dir][0];
            colposi += direction[dir][1];
            
            if(rowposi >= row){
                rowposi -=1;
                colposi += 2;
                dir = 1 - dir;
            }
            if(colposi >= column){
                colposi -= 1;
                rowposi += 2;
                dir = 1 - dir;
            }
            if(rowposi < 0){
                rowposi = 0;
                dir = 1 - dir;
            }
            if(colposi < 0){
                colposi = 0;
                dir = 1 - dir;
            }
        }
        return result;
        
        /*
        int row = matrix.length;
        int column = matrix[0].length;
        int[] result = new int[row * column];
        int posi = 0;
        for(int index = 0;index < column;index++){
            int columnposi = index;
            int rowposi = 0;
            result[posi++] = matrix[rowposi][columnposi];
            while(rowposi < (row - 1) && columnposi > 0){
                rowposi++;
                columnposi--;
                result[posi++] = matrix[rowposi][columnposi];
            }
        }
        if(column == 1)
            return result;
        else
        for(int index = 1;index < row;index++){
            int rowposi = index;
            int columnposi = column - 1;
            result[posi++] = matrix[rowposi][columnposi];
            while(rowposi < (row - 1) && columnposi > 0){
                rowposi++;
                columnposi--;
                result[posi++] = matrix[rowposi][columnposi];
            }
        }
        return result;
        */
    }
}
