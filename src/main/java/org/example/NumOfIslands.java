package org.example;

public class NumOfIslands {

  public static void main(String[] args) {
    NumOfIslands numOfIslands = new NumOfIslands();
    char[][] grid = new char[][]{
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}


    };


    int islands = numOfIslands.numIslands(grid);
    System.out.println(islands);
  }

  void dfs(char[][] grid, int row, int col, boolean[][] visited) {
    int rowSize = grid.length;
    int colSize = grid[0].length;

   int[] rowDir = {0, 0, 1, -1};
    int[] colDir = {1, -1, 0, 0};

    visited[row][col] = true;

    for (int i = 0; i < rowDir.length; i++) {

      int newRowIndex = row + rowDir[i];
      int newColIndex = col + colDir[i];

      if (newRowIndex >= 0 && newRowIndex < rowSize && newColIndex >= 0 && newColIndex < colSize
          && !visited[newRowIndex][newColIndex] && grid[newRowIndex][newColIndex] == '1') {
        dfs(grid, newRowIndex, newColIndex, visited);
      }
    }
  }

  public int numIslands(char[][] grid) {
    int islandsCounter = 0;
    int ROWS = grid.length;
    int COLS = grid[0].length;
    boolean[][] visited = new boolean[ROWS][COLS];
    // init visited
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          dfs(grid, i, j, visited);
          islandsCounter++;

        }
      }
    }

    return islandsCounter;
  }
}
