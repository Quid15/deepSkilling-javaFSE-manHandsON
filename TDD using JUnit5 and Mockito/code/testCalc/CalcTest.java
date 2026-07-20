package testCalc;

import arushCalc.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcTest {
    @Test
    public void calcTest() {
        Calculator calc = new Calculator();

        assertEquals(44, calc.add(20,24));

    }
}
