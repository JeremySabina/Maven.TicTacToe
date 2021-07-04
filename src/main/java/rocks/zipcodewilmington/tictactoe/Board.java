package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        int countO = 0;
        int countX = 0;
        Character[][] board = this.matrix;

        for (int nextRowIndex = 0; nextRowIndex < board.length; nextRowIndex++) {
            for (int nextColumnIndex = 0; nextColumnIndex < board.length; nextColumnIndex++) {
                if (board[nextRowIndex][nextColumnIndex] == 'X') {
                    countX++;
                } else if (board[nextRowIndex][nextColumnIndex] == 'O') {
                    countO++;
                }
            }
        }
        return countO < countX;
    }

    public Boolean isInFavorOfO() {

        int countO = 0;
        int countX = 0;
        Character[][] board = this.matrix;

        for (int nextRowIndex = 0; nextRowIndex < board.length; nextRowIndex++) {
            for (int nextColumnIndex = 0; nextColumnIndex < board.length; nextColumnIndex++) {
                if (board[nextRowIndex][nextColumnIndex] == 'X') {
                    countX++;
                } else if (board[nextRowIndex][nextColumnIndex] == 'O') {
                    countO++;
                }
            }
        }
        return countO > countX;

    }

    public Boolean isTie() {

        int countO = 0;
        int countX = 0;
        Character[][] board = this.matrix;

        for (int nextRowIndex = 0; nextRowIndex < board.length; nextRowIndex++) {
            for (int nextColumnIndex = 0; nextColumnIndex < board.length; nextColumnIndex++) {
                if (board[nextRowIndex][nextColumnIndex] == 'X') {
                    countX++;
                } else if (board[nextRowIndex][nextColumnIndex] == 'O') {
                    countO++;
                }
            }
        }
        return countO == countX;
    }


    public String getWinner() {
        String winnerO = "";
        int countO = 0;
        int countX = 0;
        Character[][] board = this.matrix;

        for (int nextRowIndex = 0; nextRowIndex < board.length; nextRowIndex++) {
            for (int nextColumnIndex = 0; nextColumnIndex < board.length; nextColumnIndex++) {
                if (board[nextRowIndex][nextColumnIndex] == 'X') {
                    countX++;
                } else if (board[nextRowIndex][nextColumnIndex] == 'O') {
                    countO++;
                }

            }
        }if (countO > countX) {
            winnerO = "O is the winner!";

    } else return ("X is the winner!");


}



