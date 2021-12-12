import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {

    @Test
    public void test1() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            System.out.println("e");
        });
    }

}