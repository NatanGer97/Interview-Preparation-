package org.example;

import java.util.List;

public class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new java.util.ArrayList<>();
    int left = 0;
    int right = matrix[0].length;
    int top = 0;
    int bottom = matrix.length;

    while (left < right && top < bottom) {
      // Print top row
      for (int i = left; i < right; i++) {
        result.add(matrix[top][i]);
      }
      top++;

      // Print right column
      for (int i = top; i < bottom; i++) {
        result.add(matrix[i][right - 1]);
      }
      right--;

      // Print bottom row
      if (top < bottom) {
        for (int i = right - 1; i >= left; i--) {
          result.add(matrix[bottom - 1][i]);
        }
        bottom--;
      }

      // Print left column
      if (left < right) {
        for (int i = bottom - 1; i >= top; i--) {
          result.add(matrix[i][left]);
        }
        left++;
      }
      return result;

    }
    return result;
  }

    public void spiralOrderShow ( int[][] matrix){

      int left = 0;
      int right = matrix[0].length;
      int top = 0;
      int bottom = matrix.length;

      while (left < right && top < bottom) {
// Print top row
        for (int i = left; i < right; i++) {
          System.out.print(matrix[top][i] + " ");
        }
        top++;

        // Print right column
        for (int i = top; i < bottom; i++) {
          System.out.print(matrix[i][right - 1] + " ");
        }
        right--;

        // Print bottom row
        if (top < bottom) {
          for (int i = right - 1; i >= left; i--) {
            System.out.print(matrix[bottom - 1][i] + " ");
          }
          bottom--;
        }

        // Print left column
        if (left < right) {
          for (int i = bottom - 1; i >= top; i--) {
            System.out.print(matrix[i][left] + " ");
          }
          left++;
        }

      }
    }
  }



