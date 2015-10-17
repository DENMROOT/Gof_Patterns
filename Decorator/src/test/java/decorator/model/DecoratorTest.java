package decorator.model;

import decorator.model.options.CarEngineCheck;
import decorator.model.options.CarEngineRepair;
import decorator.model.options.CarWash;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class DecoratorTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void DecoratorTest () {
        double carRepairPrice = 32.5;
        CarRepair carRepair = new BaseCarRepair();

        carRepair = new CarWash(carRepair);
        carRepair = new CarEngineCheck(carRepair);
        carRepair = new CarEngineRepair(carRepair);

        assertEquals("CarRepair Description: Base Car Repair (10.0) ," +
                " car wash (2.5) ," +
                " car engine check (5.0) ," +
                " car engine repair (15.0)",
                "CarRepair Description:" +
                carRepair.getDescription());
        assertEquals(carRepairPrice, carRepair.getPrice(), 0);
    }
}
