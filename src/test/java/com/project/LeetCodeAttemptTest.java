package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void findUniqueBinaryStringTest() {

        String[] nums1 = new String[] { "01", "10" };
        assertEquals("00", LeetCodeAttempt.findUniqueBinaryString(nums1));

        String[] nums2 = new String[] { "00", "01" };
        assertEquals("10", LeetCodeAttempt.findUniqueBinaryString(nums2));

        String[] nums3 = new String[] { "111", "011", "001" };
        assertEquals("000", LeetCodeAttempt.findUniqueBinaryString(nums3));

    }

}
