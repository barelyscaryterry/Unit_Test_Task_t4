package codefinity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    //ToDo: Remove the list creation for all the tests, replace it with list initialization

    @BeforeEach
    public void setUp() {
        List <String> input;
        List <String> expected;
        List <String> actual;
    }

    @Test
    public void testFilterAndSortPalindromes() {
        List<String> input = Arrays.asList("radar", "hello", "level", "world", "madam", "java");
        List<String> expected = Arrays.asList("radar", "level", "madam");
        List<String> actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterAndSortPalindromesWithEmptyList() {
        List<String> input = Arrays.asList();
        List<String> expected = Arrays.asList();
        List<String> actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterAndSortPalindromesWithNoPalindromes() {
        List<String> input = Arrays.asList("java", "hello", "world");
        List<String> expected = Arrays.asList();
        List<String> actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }

    //ToDo: Write a method that will test if the sorting in the method works correctly
}