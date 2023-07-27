package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testAdd() {
        // Test case 1: Testing addition of positive numbers
        int result1 = App.add(2, 3);
        assertEquals(5, result1);

        // Test case 2: Testing addition of negative numbers
        int result2 = App.add(-2, -3);
        assertEquals(-5, result2);

        // Test case 3: Testing addition of positive and negative numbers
        int result3 = App.add(5, -3);
        assertEquals(2, result3);
    }

    @Test
    public void testMain() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test case: Call the main method
        App.main(new String[]{});

        // Restore System.out
        System.setOut(System.out);

        // Verify the output
        String expectedOutput = "Result is: 5"; // This is the output of App.add(2, 3);
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void testDefaultConstructor() {
        // Test case: Create an instance of App
        App appInstance = new App();
        assertNotNull(appInstance); // Ensure the instance is not null
    }
}
