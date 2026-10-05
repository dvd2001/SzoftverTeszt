package hu.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void before(){
        System.out.println("Test started...");
    }

    @BeforeEach
    void Setup(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("2 + 3 = 5")
    void addWorks() {
        System.out.println("Addition");

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }


    @ParameterizedTest
    @DisplayName("Paramaterised addition test")
    @CsvSource({
            "1, 2, 3",
            "3, 4, 7",
            "-1, 1, 0",
            "10, 20, 30"
    })
    void paramAddWorks(int a, int b, int expected){
        System.out.println("Paramaterised addition");

        assertEquals(expected, calculator.add(a,b));
    }

    @Test
    @DisplayName("3 - 2 = 1")
    void subWorks() {
        System.out.println("Substruction");

        int result = calculator.sub(3,2);

         assertEquals(1, result);
    }

    @Test
    @DisplayName("2 * 3 = 6")
    void multiWorks(){
        System.out.println("Multiply");

        int result = calculator.multi(2,3);

        assertEquals(6,result);
    }

    @Test
    @DisplayName("6 / 2 = 3")
    void divWorks(){
        System.out.println("Division");

        int result = calculator.div(6,2);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("2 / 0 = Divide by zero Exeption")
    void divExeptionThrown(){
        System.out.println("Division by zero");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> calculator.div(2,0));

        assertEquals("Divide by zero!", exception.getMessage());
    }

    @AfterAll
    static void after(){
        System.out.println("Finished");
    }
}
