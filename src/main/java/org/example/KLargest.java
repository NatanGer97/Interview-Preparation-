package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargest {

  public static void main(String[] args) {
    KLargest kLargest = new KLargest();
    int k = 4;
    int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
    int kthLargest = kLargest.findKthLargest(nums, k);
    System.out.println(kthLargest);
  }

  public int findKthLargest(int[] nums, int k) {
    /*Arrays.sort(nums);
    int kIndexNumber = nums.length - k;
    return nums[kIndexNumber];*/

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int num : nums) {
      maxHeap.add(num);
    }
    while (k > 1 && !maxHeap.isEmpty()) {
      maxHeap.poll();
      k--;
    }

    return maxHeap.poll();

  }

}
