
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(4,calculator.multiply(2,2));
    }

}
