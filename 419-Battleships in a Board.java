int countBattleships(char** board, int boardRowSize, int boardColSize) {
    int result = 0;
        for(int row = 0;row < boardRowSize;row++){
            for(int column = 0;column < boardColSize;column++){
                if(board[row][column] == 'X'){
                    int aroundship = 0;
                    if(row > 0 && board[row - 1][column] == 'X')
                        aroundship++;
                    if(row < (boardRowSize - 1) && board[row + 1][column] == 'X')
                        aroundship++;
                    if(column > 0 && board[row][column - 1] == 'X')
                        aroundship++;
                    if(column < (boardColSize - 1) && board[row][column + 1] == 'X')
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
