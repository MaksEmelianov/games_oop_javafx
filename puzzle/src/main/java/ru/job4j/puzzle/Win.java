package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontal(board, i) || checkVertical(board, i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVertical(int[][] board, int column) {
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 1) {
                return false;
            }
        }
        return true;
    }
}
