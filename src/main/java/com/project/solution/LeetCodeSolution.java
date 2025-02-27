package com.project.solution;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {

    public static void main(String[] args) {

        String[] nums1 = new String[] { "01", "10" };
        System.out.println(findDifferentBinaryString(nums1));

        String[] nums2 = new String[] { "00", "01" };
        System.out.println(findDifferentBinaryString(nums2));

        String[] nums3 = new String[] { "111", "011", "001" };
        System.out.println(findDifferentBinaryString(nums3));

    }

    static int n;
    static Set<String> numsSet = new HashSet();

    private static String generate(String curr) {

        if (curr.length() == n) {

            if (!numsSet.contains(curr)) {
                return curr;
            }

            return "";

        }

        String addZero = generate(curr + "0");

        if (addZero.length() > 0) {
            return addZero;
        }

        return generate(curr + "1");

    }

    public static String findDifferentBinaryString(String[] nums) {

        numsSet.clear();

        n = nums.length;

        for (String s : nums) {
            numsSet.add(s);
        }

        return generate("");

    }

}
