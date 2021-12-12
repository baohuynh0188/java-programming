import code.StringHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperParameterizedTest {
    private static StringHelper stringHelper;

    @BeforeAll
    public static void setup() {
        stringHelper = new StringHelper();
    }

    @ParameterizedTest
    @ValueSource(strings = {"AADC", "AAAA", "DCDC", "ADC"})
    public void testTruncateAInFirst2Positions_1(String str) {
        assertEquals("DC", stringHelper.truncateAInFirst2Positions(str));
    }


    @Test
    @DisplayName("Name testcase")
    @Disabled("Disabled until bug #99 has been fixed")
    public void testAreFirstAndLastTwoCharactersTheSame_1() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_2() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_3() {
        assertTimeoutPreemptively(Duration.ofMillis(1), () -> {
            while (true) {
                stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD");
            }
        });
    }

}