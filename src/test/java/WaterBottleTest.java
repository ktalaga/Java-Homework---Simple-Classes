import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

}
