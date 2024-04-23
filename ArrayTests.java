import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTests {
    
    @Test 
    public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
    }

    @Test
    public void testReversed() {
        int[] input1 = { };
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }

    // Additional tests for reverseInPlace method
    @Test
    public void testReverseInPlaceMultipleElements() {
        int[] input = {1, 2, 3, 4, 5};
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input);
    }

    // Additional tests for reversed method
    @Test
    public void testReversedMultipleElements() {
        int[] input = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input));
    }
}

