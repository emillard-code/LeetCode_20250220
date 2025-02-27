package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void findDifferentBinaryStringTest() {

        String[] nums1 = new String[] { "01", "10" };
        assertEquals("00", LeetCodeSolution.findDifferentBinaryString(nums1));

        String[] nums2 = new String[] { "00", "01" };
        assertEquals("10", LeetCodeSolution.findDifferentBinaryString(nums2));

        String[] nums3 = new String[] { "111", "011", "001" };
        assertEquals("000", LeetCodeSolution.findDifferentBinaryString(nums3));

    }

}
