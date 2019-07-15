import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, printer.getVolume());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void hasPrint(){
        assertEquals(80, printer.print(2, 10));
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(80, printer.toner(2, 10));
    }
}
