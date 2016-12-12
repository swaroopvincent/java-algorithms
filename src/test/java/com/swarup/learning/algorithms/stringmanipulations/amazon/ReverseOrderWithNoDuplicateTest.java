package com.swarup.learning.algorithms.stringmanipulations.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by swaroop on 12/12/16.
 */
public class ReverseOrderWithNoDuplicateTest {

    private ReverseOrderWithNoDuplicate objectUnderTest;

    @org.junit.Before
    public void setUp() throws Exception {
        objectUnderTest = new ReverseOrderWithNoDuplicate();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        objectUnderTest = null;
    }

    @Test
    public void stringWithDuplicate() {
        String input = "abbccc";
        System.out.println(objectUnderTest.solution(input));
    }

}