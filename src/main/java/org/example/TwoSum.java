import java.util.HashMap;
import java.util.Map;
/*
LEETCODE DESCRIPTION:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        return null;
    }

    public static void main(String[] args) {

        TwoSum test = new TwoSum();

        int[] nums = {2, 11, 15, 7};
        int target = 9;

        int[] result = test.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);

    }
}