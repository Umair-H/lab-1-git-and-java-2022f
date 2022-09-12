/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 100)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }
    @Test(timeout = 100)
    public void testhussa906() {
        String expected = "Hi! My name is Umair! I like dogs more than cats! CSC207 is cool";
        String actual = IntroLab.hussa906();
        assertEquals(expected, actual);
    }
}
