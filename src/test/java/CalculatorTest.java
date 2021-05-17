
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void canAdd(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

}
