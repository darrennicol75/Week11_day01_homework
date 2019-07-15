import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, waterbottle.getCapacity());
    }

    @Test
    public void hasEmpty(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void hasDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void hasRefill(){
        assertEquals(100, waterbottle.refill());
    }
}
