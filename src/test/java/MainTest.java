package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testServerIsUp() {
        // Grab the status from our Main application
        String currentStatus = Main.getStatus();

        // Check if the status is exactly equal to "UP"
        assertEquals("UP", currentStatus);
    }
}