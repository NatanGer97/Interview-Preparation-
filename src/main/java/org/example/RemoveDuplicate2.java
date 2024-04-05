package org.example;

public class RemoveDuplicate2 {

  public static int removeDuplicates(int[] nums) {

    int k = 1;
    for (int i = 1; i < nums.length; i++) {
      int currenNumber = nums[i];
      if (k == 1 || nums[k - 2] != nums[i]) {
        nums[k++] = currenNumber;
      }
    }
    return k;

  }

  public static void main(String[] args) {
//    int[] nums = new int[] {1,1,1,2,2,3};
//    int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
    int[] nums = new int[]{1, 3};

    int k = RemoveDuplicate2.removeDuplicates(nums);
    System.out.println(k);
  }
}
