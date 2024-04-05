package org.example;

import java.util.Arrays;

public class RemoveElement {
  public static int solve(int[] nums, int val) {
    int rightIndex = nums.length - 1;
    int leftIndex = 0;

    while (leftIndex < nums.length && leftIndex < rightIndex) {
      if (nums[leftIndex] == val) {
        while (nums[rightIndex] == val) rightIndex--;
        int temp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = temp;

      }
      leftIndex++;

    }

    int counter = 0;
    while (nums[counter] != val) counter++;
    return counter;

  }

  public static void main(String[] args) {

//    int[] nums = new int[] {0,1,2,2,3,0,4,2};
//    int[] nums = new int[] {3,2,2,3};
    int[] nums = new int[] {1};
    int results = RemoveElement.solve(nums, 1);
    System.out.println(results);
//    System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));
  }


}
