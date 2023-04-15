import java.util.Scanner;

public class sudoku {
  
    
    // Helper function to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]==0){
                    System.out.print (" ");
    
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Helper function to check if a given number is valid in the given row and column
    public static boolean isValid(int[][] board, int row, int col, int num) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        
        // Check box
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    // Helper function to solve the Sudoku puzzle using a backtracking algorithm
    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) { // Found an empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) { // Check if number is valid
                            board[row][col] = num; // Assign number
                            if (solveSudoku(board)) { // Recursively solve the rest of the puzzle
                                return true;
                            }
                            board[row][col] = 0; // Backtrack if solution not found
                        }
                    }
                    return false; // No valid number found for this cell, backtrack
                }
            }
        }
        return true; // Puzzle solved
    }
    
    public static void main(String[] args) {
        int[][] board = new int[9][9];
        Scanner scanner = new Scanner(System.in);
        
        // Read in the Sudoku puzzle
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Enter value for row " + (i+1) + ", column " + (j+1) + ": ");
                board[i][j] = scanner.nextInt();
                // scanner.nextInt();

            }
        }
        
        // Solve the Sudoku puzzle
        if (solveSudoku(board)) {
            System.out.println("Solution:");
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }
}

