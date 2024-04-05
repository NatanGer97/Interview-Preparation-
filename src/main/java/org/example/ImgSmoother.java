package org.example;

import java.util.ArrayList;

public class ImgSmoother {

  public static int[][] imageSmoother(int[][] img) {
    int rows = img.length;
    int cols = img[0].length;

    int[][] results = new int[rows][cols];
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        results[row][col] = calcSum(row, col, rows, cols, img);
      }
    }
    return results;
  }

  private static int calcSum(int row, int col, int rows, int cols, int[][] img) {
    ArrayList<int[]> directions = new ArrayList<>();
    directions.add(new int[]{0, 0});
    directions.add(new int[]{0, 1});
    directions.add(new int[]{0, -1});
    directions.add(new int[]{1, 0});
    directions.add(new int[]{1, 1});
    directions.add(new int[]{1, -1});
    directions.add(new int[]{-1, 0});
    directions.add(new int[]{-1, 1});
    directions.add(new int[]{-1, -1});
    int sum = 0;
    int count = 0;
    for (int[] direction : directions) {
      int newRow = row + direction[0];
      int newCol = col + direction[1];

      if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
        sum += img[newRow][newCol];
        count++;
      }
    }
    return sum / count;
  }

  public static void main(String[] args) {
    int[][] img = new int[][]{
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    int[][] results = ImgSmoother.imageSmoother(img);
    for (int[] result : results) {
      for (int i : result) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }


}
