import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000, 10000);
    }

    @Test
    public void hasSheetsLeft(){
        assertEquals(1000, printer.hasSheetsLeft());
    }

    @Test
    public void canPrint(){
        printer.print(200, 2);
        assertEquals(600, printer.hasSheetsLeft());
    }

    @Test
    public void canReduceTonerVolume(){
        printer.print(50, 5);
        assertEquals(9750, printer.hasTonerVolume());
    }

}
