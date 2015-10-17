package bridge.model;

import bridge.model.furnitureLinesImpl.GloryFurnitureLine;
import bridge.model.furnitureLinesImpl.VictoryFurnitureLine;
import bridge.model.productImpl.HeaterModule;
import bridge.model.productImpl.StorageModule;
import bridge.model.productImpl.WashingModule;
import org.junit.Test;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class BridgeTest {
    @Test
    public void BridgeTest() {
        Product[] products = {new WashingModule("Washing Module"),
                new StorageModule("Storage Module"),
                new HeaterModule("Heater Module")};
        FurnitureLine line_1;

        for (Product product : products) {
            line_1 = new GloryFurnitureLine(product, "Glory furniture Line");

            line_1.produceProduct();
            line_1.assemble();
            line_1.printDetails();
        }

        for (Product product : products) {
            line_1 = new VictoryFurnitureLine(product, "Victory furniture Line");

            line_1.produceProduct();
            line_1.assemble();
            line_1.printDetails();
        }
    }
}
