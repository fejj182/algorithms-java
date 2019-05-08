import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void find_middle_value()
    {
        List<String> list = Arrays.asList("Alpha", "Bravo", "Charlie");
        BinarySearch bs = new BinarySearch(list);
        assertEquals(1, bs.find("Bravo"));
    }

    @Test
    void fail_for_missing_value()
    {
        List<String> list = Arrays.asList("Alpha", "Bravo", "Charlie");
        BinarySearch bs = new BinarySearch(list);
        assertEquals(-1, bs.find("Delta"));
    }

    @Test
    void find_first_value()
    {
        List<String> list = Arrays.asList("Alpha", "Bravo", "Charlie");
        BinarySearch bs = new BinarySearch(list);
        assertEquals(0, bs.find("Alpha"));
    }

    @Test
    void find_last_value()
    {
        List<String> list = Arrays.asList("Alpha", "Bravo", "Charlie");
        BinarySearch bs = new BinarySearch(list);
        assertEquals(2, bs.find("Charlie"));
    }
}
