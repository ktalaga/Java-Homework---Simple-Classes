import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000);
    }

    @Test
    public void hasSheetsLeft(){
        assertEquals(1000, printer.sheetsLeft);
    }

    @Test
    public void canPrint(){
        printer.print(100, 2);
        assertEquals(800, printer.sheetsLeft);
    }

}
