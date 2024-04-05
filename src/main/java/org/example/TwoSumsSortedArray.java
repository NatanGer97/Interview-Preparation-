package org.example;

public class TwoSumsSortedArray {

  public static void main(String[] args) {
    int[] numbers = new int[]{2, 7, 11, 15};
    int target = 9;
    int[] results = new TwoSumsSortedArray().twoSum(numbers, target);
    System.out.println(results[0] + " " + results[1]);
  }

  public int[] twoSum(int[] numbers, int target) {
    int[] results = new int[2];
    int left = 0; int right = numbers.length - 1;
    while (left < right) {
      int currentSum = numbers[left] + numbers[right];
      if (currentSum == target) {
        results[0] = numbers[left];
        results[1] = numbers[right];
        return results;
      }
      if (currentSum < target) {
        right--;
      }
      else { // currentSum > target
        left++;
      }
    }
    return results;
  }
}
