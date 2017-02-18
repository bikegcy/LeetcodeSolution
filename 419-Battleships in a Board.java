/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ Silly Algorithm: If there are 2 ships around a certain ship, then continue.
 * @ If there is one ship around a certain ship, result = result + 1;if there is an alone ship, result = result + 2
 * @ Return result / 2
 */
public class Solution {
    public int countBattleships(char[][] board) {
        int result = 0;
        for(int row = 0;row < board.length;row++){
            for(int column = 0;column < board[row].length;column++){
                if(board[row][column] == 'X'){
                    int aroundship = 0;
                    if(row > 0 && board[row - 1][column] == 'X')
                        aroundship++;
                    if(row < (board.length - 1) && board[row + 1][column] == 'X')
                        aroundship++;
                    if(column > 0 && board[row][column - 1] == 'X')
                        aroundship++;
                    if(column < (board[row].length - 1) && board[row][column + 1] == 'X')
                        aroundship++;
                    switch(aroundship){
                        case 0:
                            result += 2;
                            break;
                        case 1:
                            result += 1;
                            break;
                        case 2:
                            result += 0;
                            break;
                    }
                }
            }//column loop
        }//row loop
        return (result >> 1);
    }
}
