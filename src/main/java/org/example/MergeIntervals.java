package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
  public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
    ArrayList<int[]> mergedIntervals = new ArrayList<>();
    mergedIntervals.add(intervals[0]);

    for (int i = 1; i < intervals.length; i++) {
      int[] interval = intervals[i];
      int currentStartTime = interval[0];
      int currentFinishTime = interval[1];
      int[] lastMergedInterval = mergedIntervals.get(mergedIntervals.size() - 1);

      if (currentStartTime <= lastMergedInterval[1]) {
        if (currentFinishTime > lastMergedInterval[1]) {
          int[] lastMerged = mergedIntervals.remove(mergedIntervals.size() - 1);
          lastMerged[1] = currentFinishTime;
          mergedIntervals.add(lastMerged);

        }

      }
      else {
        mergedIntervals.add(new int[]{currentStartTime, currentFinishTime});
      }
    }
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);


  }

  public static void main(String[] args) {

    int[][] intervals = new int[][]{
        {1, 3},
        {2, 6},
        {8, 10},
        {15, 18}
    };
    int[][] results = MergeIntervals.merge(intervals);
    for (int[] result : results) {
      for (int i : result) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }

}
