package org.example.CrackingTheCodingInterview.ArraysStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsUnique {
  /*
  Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
  cannot use additional data structures?
*/

  public static boolean isUnique(String str) {
    Map<Character, Character> map = new HashMap<>();
    char[] srtAsChars = str.toCharArray();
    for (char srtAsChar : srtAsChars) {
      if (map.containsKey(srtAsChar)) {
        return false;
      }
      map.put(srtAsChar, srtAsChar );
    }
    return true;

  }

  public static boolean isUniqueNoAdditionSpace(String str) {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);

    for (int i = 1; i < charArray.length; i++) {
      if (charArray[i-1] == charArray[i]) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    System.out.println("is unique: " +  IsUnique.isUnique("abss"));
    System.out.println("is unique: " +  IsUnique.isUniqueNoAdditionSpace("abs"));

  }

}
