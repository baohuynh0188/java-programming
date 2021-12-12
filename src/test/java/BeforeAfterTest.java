import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BeforeAfterTest {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Before test");
    }

    @Test
    public void truncateAInFirst2Positions_1() {
        System.out.println("Test 1 executed");
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
        System.out.println("Test 2 executed");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("After test executed");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}