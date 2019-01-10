package com.github.glistman.text;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringsTest {

    @Test
    public void testEmptyStringWithNullParameter() {
        assertTrue(Strings.isNullOrEmpty(null));
    }

    @Test
    public void testEmptyStringWithEmptyString() {
        assertTrue(Strings.isNullOrEmpty(""));
    }

    @Test
    public void testEmptyStringWithNonEmptyString() {
        assertTrue(Strings.isNullOrEmpty("     "));
    }

    @Test
    public void testNonEmptyStringWithNullParameter() {
        assertFalse(Strings.nonEmpty(null));
    }

    @Test
    public void testNonEmptyStringWithEmptyString() {
        assertFalse(Strings.nonEmpty(""));
    }

    @Test
    public void testNonEmptyStringWithNonEmptyString() {
        assertFalse(Strings.nonEmpty("     "));
    }

}
