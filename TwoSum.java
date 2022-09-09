/*

Problem
Given an array of unique integers, numbers, and an integer targetSum, return two numbers from the array so that they add up to targetSum. If there are no pairs with the required targetSum in the input array, then return null.

For example, for array input [3, 6, 10, 14] and targetSum = 9, it should return [3, 6] or [6, 3].

If the array is null or the length is less than two, it should return null.

In the case of an array where a pair with a sum equal to targetSum does not exist, it should return null.

*/
import java.util.*;

class Solution {
  // time complexity O(n) | space complexity O(n)
  public static int[] twoSum(int[] numbers, int targetSum) {
      int[] result = null;
      
      if (numbers == null || numbers.length < 2) {
        return null;
      }

      Set<Integer> map = new HashSet<>(); 
      for (int i= 0; i < numbers.length; i++) {
        int diff = targetSum - numbers[i];
        if (map.contains(diff)) {
            result = new int[2];
            result[0] = numbers[i]; 
            result[1] = diff;
            break;
        }
        map.add(numbers[i]);
      }
      
      return result;
  }

  public static void main(String[] args){
    System.out.println(Arrays.toString(
      twoSum(new int[]{3, 6, 10, 14}, 9))); // [6, 3] best case

    System.out.println(Arrays.toString( 
      twoSum(null, 4))); // null - invalid input
    
    System.out.println(Arrays.toString(
      twoSum(new int[]{3, 1, 4}, 9))); // null - no pair exists

    System.out.println(Arrays.toString(
      twoSum(new int[]{3}, 9))); // null - array with less than two integers 
  }
}
