package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  public static void main(String[] args) {
    ThreeSum threeSum = new ThreeSum();
    List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    for (List<Integer> list : lists) {
      System.out.println(list);
    }
  }

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    Set<List<Integer>> results = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      // x + y = -z
      int z = -nums[i];
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int leftRightSum = nums[left] + nums[right];
        if (leftRightSum == z) {
          results.add(List.of(nums[left], nums[right],nums[i]));
        }
        if (leftRightSum < z) {
          left++;
        } else {
          right--;
        }
      }
    }

    return results.stream().toList();

  }


}
