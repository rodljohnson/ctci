package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q09_StringRotationTest {

    @Test
    public void isRotationTest() {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        assertTrue(Q09_StringRotation.isRotation(pairs[0][0], pairs[0][1]));
        assertTrue(Q09_StringRotation.isRotation(pairs[1][0], pairs[1][1]));
        assertFalse(Q09_StringRotation.isRotation(pairs[2][0], pairs[2][1]));
    }
}