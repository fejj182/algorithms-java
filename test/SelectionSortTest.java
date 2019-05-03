import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {
    @Test
    void puts_smallest_number_to_the_left() {
        SelectionSort sorter = new SelectionSort();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        sorter.sort(list);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
    }

    @Test
    void puts_smallest_number_to_the_left2() {
        SelectionSort sorter = new SelectionSort();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        sorter.sort(list);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
    }
}
