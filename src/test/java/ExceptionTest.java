import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    public void test() {
        int[] numbers = null;
        assertThrows(NullPointerException.class, () -> {
           Arrays.sort(numbers);
        });
    }
}
