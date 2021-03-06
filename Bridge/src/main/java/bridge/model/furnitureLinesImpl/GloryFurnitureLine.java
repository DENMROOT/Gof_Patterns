package bridge.model.furnitureLinesImpl;

import bridge.model.FurnitureLine;
import bridge.model.Product;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class GloryFurnitureLine extends FurnitureLine {
    private final Product product;
    private final String furnitureLineName;

    public GloryFurnitureLine(Product product, String furnitureLineName) {
        super(product, furnitureLineName);
        this.product = product;
        this.furnitureLineName = furnitureLineName;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " +
                product.productName() +
                " for " +
                furnitureLineName);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product " +
                product.productName() +
                " according to " +
                furnitureLineName);
    }
}
