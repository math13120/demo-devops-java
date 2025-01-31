package com.example;

import org.example.App;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testSum() {
        int result = App.sum(2, 3);
        assertEquals("2 + 3 should be 5",5, result);
    }
}




