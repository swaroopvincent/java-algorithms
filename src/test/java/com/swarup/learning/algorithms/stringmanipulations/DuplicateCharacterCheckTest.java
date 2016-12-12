package com.swarup.learning.algorithms.stringmanipulations;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by swaroop on 12/12/16.
 */
public class DuplicateCharacterCheckTest {

    private DuplicateCharacterCheck objectUnderTest;

    @org.junit.Before
    public void setUp() throws Exception {
        objectUnderTest = new DuplicateCharacterCheck();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        objectUnderTest = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void inputAsNullThrowProperException() {
        objectUnderTest.solution(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void inputAsEmptyStringThrowProperException() {
        objectUnderTest.solution("");
    }

    @Test
    public void inputWithNoDuplicateCharacter() {
        final String stringWithNoDuplicateCharacter = "abc";
        assertFalse(objectUnderTest.solution(stringWithNoDuplicateCharacter));
    }

    @Test
    public void inputWithDuplicateCharacter() {
        final String stringWithDuplicateCharacter = "abca";
        assertTrue(objectUnderTest.solution(stringWithDuplicateCharacter));
    }
}