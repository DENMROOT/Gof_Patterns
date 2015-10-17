package bridge.model;

/**
 * Created by dmakarov on 10/8/2015.
 */
public abstract class FurnitureLine {
    private final Product product;
    private final String furnitureLineName;

    public FurnitureLine(Product product, String furnitureLineName) {
        this.product = product;
        this.furnitureLineName = furnitureLineName;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails(){
        System.out.println("Furnityre: " + furnitureLineName +", Product : " + product.productName());
    }
}
