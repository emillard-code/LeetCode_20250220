package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        String[] nums1 = new String[] { "01", "10" };
        System.out.println(findUniqueBinaryString(nums1));

        String[] nums2 = new String[] { "00", "01" };
        System.out.println(findUniqueBinaryString(nums2));

        String[] nums3 = new String[] { "111", "011", "001" };
        System.out.println(findUniqueBinaryString(nums3));

    }

    // This method finds a unique binary string that isn't already in string[] nums.
    public static String findUniqueBinaryString(String[] nums) {

        // In order to accomplish this, it calls a recursive helper method.
        return findString(nums, "");

    }

    // This is a helper method that finds a unique binary string that isn't already in string[] nums.
    // It will gradually add a character to string num during each recursive call until it finds a
    // unique string.
    private static String findString(String[] nums, String num) {

        // If the length of string num matches the lengths of the strings in string[] nums,
        // then return string num as it is as we do not want to test strings beyond that length.
        if (num.length() == nums[0].length()) {
            return num;
        }

        // During each call of this method, perform two recursive calls, each one adding
        // either '0' or '1' to the end of string num respectively.
        String newNum0 = findString(nums, num + '0');
        String newNum1 = findString(nums, num + '1');

        // If either of them do not result in a null, and are not already in the string[] nums array,
        // then return the first valid string that fulfills both of these criteria.
        if (newNum0 != null && !Arrays.asList(nums).contains(newNum0)) {
            return newNum0;
        } else if (newNum1 != null && !Arrays.asList(nums).contains(newNum1)) {
            return newNum1;
        }

        // If a match wasn't found, return null.
        return null;

    }

}
