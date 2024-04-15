package org.example;/*
LEETCODE DESCRIPTION:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
 */
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        //Create a hash map that will act like a dictionary for the frequency of each number
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int num : nums) {

            if (frequencies.containsKey(num)) {
                frequencies.put(num, frequencies.get(num) + 1);
            } else {
                frequencies.put(num, 1); // it's first time appearing
            }
        }

        Map.Entry<Integer, Integer> mElem = null;

        for (Map.Entry<Integer, Integer> elem : frequencies.entrySet()) {
            if (mElem== null || elem.getValue() > mElem.getValue()) {
                mElem = elem;
            }
        }

        return mElem.getKey();
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + majorityElement(nums));
    }
}