package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] results = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int y = target - nums[i];
      if (map.containsKey(y)) {
        results[0] = map.get(y);
        results[1] = i;
      }
      else {
        map.put(nums[i], i);
      }
    }
    return results;


  }

  public static void main(String[] args) {
    int[] ints = TwoSums.twoSum(new int[]{3,2,4}, 6);
    System.out.println(Arrays.toString(ints));
  }

}
