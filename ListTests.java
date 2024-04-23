import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> input = Arrays.asList("apple", "banana", "orange", "grape", "peach");
        List<String> result = ListExamples.filter(input, s -> s.length() > 5);
        List<String> expected = Arrays.asList("orange", "banana");
        assertEquals(expected, result);
    }

    @Test
    public void testMerge() {
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("grape", "peach", "strawberry");
        List<String> result = ListExamples.merge(list1, list2);
        List<String> expected = Arrays.asList("apple", "banana", "grape", "orange", "peach", "strawberry");
        assertEquals(expected, result);
    }
}
