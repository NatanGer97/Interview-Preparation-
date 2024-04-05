package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RandomizedSet {

  private Map<Integer, Integer> map;
  private List<Integer> list;

  public RandomizedSet() {
    this.map = new HashMap<>();
    this.list = new ArrayList<>();

  }

  public static void main(String[] args) {
    RandomizedSet randomizedSet = new RandomizedSet();
    System.out.println(randomizedSet.insert(0));
    System.out.println(randomizedSet.insert(1));
    System.out.println(randomizedSet.remove(0));
    System.out.println(randomizedSet.insert(2));
    System.out.println(randomizedSet.remove(1));
    System.out.println(randomizedSet.getRandom());

  }

  public boolean insert(int val) {
    boolean containsKey = this.map.containsKey(val);
    if (!containsKey) {
      list.add(val);
      map.put(val, list.size() - 1);
    }

    return !containsKey;
  }

  public boolean remove(int val) {
    boolean containsKey = map.containsKey(val);
    if (containsKey) {
      int valIndex = map.get(val);
      Integer lastValueInList = list.get(list.size() - 1);
      list.set(valIndex, lastValueInList);
      map.put(lastValueInList, valIndex);
      list.remove(list.size() - 1);
      map.remove(val);

    }

    return containsKey;

  }

  public int getRandom() {

    int randIndex = (int) (Math.random() * list.size());
    return list.get(randIndex);

  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such: RandomizedSet obj = new RandomizedSet(); boolean param_1 =
 * obj.insert(val); boolean param_2 = obj.remove(val); int param_3 = obj.getRandom();
 */