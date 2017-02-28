/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @So many situations to consider!
 */
public class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        }
        ////////mine///////
        int front1 = 0, front2 = 0, end1 = 0, end2 = 0;
        if(board[0].length == 1 && board.length == 1){
            if(board[click[0]][click[1]] == 'M'){
                board[click[0]][click[1]] = 'X';
            }
            else board[click[0]][click[1]] = 'B';
            return board;
        }
        else if(board.length == 1){
            if(click[1] > 0 && click[1] < board[0].length - 1){
                front1 = 0;
                end1 = 1;
                front2 = click[1] - 1;
                end2 = click[1] + 2;
            }
            else if(click[1] == 0){
                front1 = 0;
                end1 = 1;
                front2 = 0;
                end2 = 2;
            }
            else{
                front1 = 0;
                end1 = 1;
                front2 = click[1] - 1;
                end2 = click[1] + 1;
            }
        }
        else if(board[0].length == 1){
            if(click[0] > 0 && click[0] < board.length - 1){
                front1 = click[0] - 1;
                end1 = click[0] + 2;
                front2 = 0;
                end2 = 1;
            }
            else if(click[0] == 0){
                front1 = 0;
                end1 = 2;
                front2 = 0;
                end2 = 1;
            }
            else{
                front1 = click[0] - 1;
                end1 = click[0] + 1;
                front2 = 0;
                end2 = 1;
            }
        }
        
        else{
        //int[] posi = new int[4];
        if(click[0] > 0 && click[0] < (board.length - 1)){
            if(click[1] > 0 && click[1] < board[0].length - 1){
                front1 = click[0] - 1;
                end1 = click[0] + 2;
                front2 = click[1] - 1;
                end2 = click[1] + 2;
            }//there are 9 points around
            else if(click[1] == 0){
                front1 = click[0] - 1;
                end1 = click[0] + 2;
                front2 = 0;
                end2 = 2;
            }//there are 6 points,left
            else{
                front1 = click[0] - 1;
                end1 = click[0] + 2;
                front2 = click[1] - 1;
                end2 = click[1] + 1;
            }//6 points,right
        }
        else if(click[0] == 0){
            if(click[1] > 0 && click[1] < board[0].length - 1){
                front1 = 0;
                end1 = 2;
                front2 = click[1] - 1;
                end2 = click[1] + 2;
            }//up,6 points
            else if(click[1] == 0){
                front1 = 0;
                end1 = 2;
                front2 = 0;
                end2 = 2;
            }//left/up corner 4points
            else{
                front1 = 0;
                end1 = 2;
                front2 = click[1] - 1;
                end2 = click[1] + 1;
            }//right/up corner 4points
        }
        else{
            if(click[1] > 0 && click[1] < board[0].length - 1){
                front1 = click[0] - 1;
                end1 = click[0] + 1;
                front2 = click[1] - 1;
                end2 = click[1] + 2;
            }//bottom, 6points
            else if(click[1] == 0){
                front1 = click[0] - 1;
                end1 = click[0] + 1;
                front2 = 0;
                end2 = 2;
            }//left/bottom 4 points
            else{
                front1 = click[0] - 1;
                end1 = click[0] + 1;
                front2 = click[1] - 1;
                end2 = click[1] + 1;
            }
        }
        }///big else
        int minenum = 0;
        for(int i = front1;i < end1;i++){
            for(int j = front2;j < end2;j++){
                if(board[i][j] == 'M'){minenum++;}
            }
        }//get the number of mines
        if(minenum == 0){
            board[click[0]][click[1]] = 'B';
            for(int i = front1;i < end1;i++){
                for(int j = front2;j < end2;j++){
                    if(i == click[0] && j == click[1])
                        continue;
                    if(board[i][j] == 'E'){
                        click[0] = i;
                        click[1] = j;
                        updateBoard(board,click);
                    }
                }
            }//process
        }
        else {board[click[0]][click[1]] = (char)(minenum + 48);}
        return board;
    }
}
