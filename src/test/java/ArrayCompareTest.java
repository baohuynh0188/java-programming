import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCompareTest {

    @Test
    public void test1() {
        int[] numbers = new int[]{12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}