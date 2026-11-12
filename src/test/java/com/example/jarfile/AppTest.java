
package com.example.jarfile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(30.0, 20.0 + 10.0);
    }

    @Test
    void testSubtraction() {
        assertEquals(10.0, 20.0 - 10.0);
    }

    @Test
    void testMultiplication() {
        assertEquals(200.0, 20.0 * 10.0);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, 20.0 / 10.0);
    }

}

