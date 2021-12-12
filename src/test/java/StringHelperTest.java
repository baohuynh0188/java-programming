import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {
    private static StringHelper stringHelper;

    @BeforeAll
    public static void setup() {
        stringHelper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_1() {
        assertEquals("DC", stringHelper.truncateAInFirst2Positions("AADC"));
    }

    @Test
    public void testTruncateAInFirst2Positions_2() {
        assertEquals("DC", stringHelper.truncateAInFirst2Positions("ADC"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_1() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_2() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

}