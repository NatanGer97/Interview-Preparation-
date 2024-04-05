package org.example;

public class RemoveDuplicates {

  public static int removeDuplicates(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
        int currentNum = nums[i];
        if (currentNum != nums[k]) {
          nums[++k] = currentNum;
        }
    }
    return k;
  }


}
