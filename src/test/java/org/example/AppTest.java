package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    Square square = new Square();

    @Before
    public void beforeTest() {
        square.equation();
    }

    @Test
    public void shouldAnswerWithTrue() {
        int expected = square.getExpected();
        int actual = 1;
        Assert.assertEquals(expected, actual);
        System.out.println("HELLLLLOOOOOOOOOo");
    }
}
