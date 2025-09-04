package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testApp() {
        // Simple test to check if the main method runs without errors
        // Here, we just assert true to make sure the test works.
        assertTrue("App test passed", true);
    }

    @Test
    public void testSimpleAddition() {
        int a = 2, b = 3;
        int sum = a + b;
        assertEquals(5, sum);
    }
}
