import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void canFillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }

}
